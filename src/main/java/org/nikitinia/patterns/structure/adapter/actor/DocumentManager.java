package org.nikitinia.patterns.structure.adapter.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;

@Slf4j
public class DocumentManager {

    HashMap<String, Document> hashMap =
            new HashMap();

    public void saveDocument(Document document) {
        log.info("Save");
    }

    public void updateDocument(Document document) {
        log.info("Update");
    }

    public void loadDocument(Document document) {

        log.info("Load");
    }

    public void deleteDocument(Document document) {

        log.info("Delete");
    }


}