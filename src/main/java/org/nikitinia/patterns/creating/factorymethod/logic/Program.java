package org.nikitinia.patterns.creating.factorymethod.logic;

import org.nikitinia.patterns.creating.factorymethod.action.DocumentCreator;
import org.nikitinia.patterns.creating.factorymethod.actor.Document;
import org.nikitinia.patterns.creating.factorymethod.action.MediaDocumentCreator;
import org.nikitinia.patterns.creating.factorymethod.action.OfficialDocumentCreator;
import org.nikitinia.patterns.creating.factorymethod.dictionary.TypeNotify;
import org.nikitinia.patterns.creating.factorymethod.exception.ProcessException;

public class Program {

    public static void main(String[] args) {
        DocumentCreator creator = getCreator(TypeNotify.OFFICIAL);

        Document document = creator.createDocument();
        document.notifyUser();
    }

    private static DocumentCreator getCreator(TypeNotify typeNotify) {
        if (typeNotify.equals(TypeNotify.MEDIA))
            return new MediaDocumentCreator();
        else if (typeNotify.equals(TypeNotify.OFFICIAL))
            return new OfficialDocumentCreator();
        else
            throw new ProcessException(String.format("Something bad with %s", TypeNotify.OTHER));
    }

}
