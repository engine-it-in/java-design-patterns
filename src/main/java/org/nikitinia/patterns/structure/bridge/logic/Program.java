package org.nikitinia.patterns.structure.bridge.logic;

import org.nikitinia.patterns.structure.bridge.action.AndroidInterfaze;
import org.nikitinia.patterns.structure.bridge.action.IOSInterfaze;
import org.nikitinia.patterns.structure.bridge.actor.Document;
import org.nikitinia.patterns.structure.bridge.actor.MobileDocument;
import org.nikitinia.patterns.structure.bridge.actor.WebDocument;

public class Program {
    public static void main(String[] args) {

        Document webIosDocument = new WebDocument(new IOSInterfaze());
        Document webAndroidDocument = new WebDocument(new AndroidInterfaze());
        Document mobileIOSDocument = new MobileDocument(new IOSInterfaze());
        Document mobileAndroidDocument = new MobileDocument(new AndroidInterfaze());

        webIosDocument.createDocument();
        webAndroidDocument.createDocument();
        mobileAndroidDocument.createDocument();
        mobileIOSDocument.createDocument();

    }
}
