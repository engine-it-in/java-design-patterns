package org.nikitinia.patterns.structure.bridge.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.structure.bridge.action.AndroidInterfaze;
import org.nikitinia.patterns.structure.bridge.action.IOSInterfaze;
import org.nikitinia.patterns.structure.bridge.actor.DocumentAbstract;
import org.nikitinia.patterns.structure.bridge.actor.DocumentRepository;
import org.nikitinia.patterns.structure.bridge.actor.MobileDocument;
import org.nikitinia.patterns.structure.bridge.actor.WebDocument;

public class Program {
    public static void main(String[] args) {

        DocumentRepository documentRepository = new DocumentRepository();
        org.nikitinia.domain.model.documents.Document document = DocumentCreator.documentBuildWithNumber(1.0);
        documentRepository.putDocument(document);

        DocumentAbstract webIosDocument = new WebDocument(new IOSInterfaze(documentRepository));
        DocumentAbstract webAndroidDocument = new WebDocument(new AndroidInterfaze(documentRepository));
        DocumentAbstract mobileIOSDocument = new MobileDocument(new IOSInterfaze(documentRepository));
        DocumentAbstract mobileAndroidDocument = new MobileDocument(new AndroidInterfaze(documentRepository));

        webIosDocument.createDocument(document);
        webAndroidDocument.createDocument(document);
        mobileAndroidDocument.createDocument(document);
        mobileIOSDocument.createDocument(document);

    }
}
