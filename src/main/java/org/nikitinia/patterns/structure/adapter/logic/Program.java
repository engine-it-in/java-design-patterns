package org.nikitinia.patterns.structure.adapter.logic;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;

@Slf4j
public class Program {
    public static void main(String[] args) {

        Document document =
                DocumentCreator.documentBuildWithNumber(1.0);

        DocumentDatabase dataBase = new Adapter();

        dataBase.insert(document);
        Document loadDocument = dataBase.select(document.getNumber());
        log.info("load document is: {}", loadDocument);
        dataBase.update(document);
        log.info("after update status document is : {}", document.getStatus());
        dataBase.remove(document);

        dataBase.stateDocumentMap();
    }
}
