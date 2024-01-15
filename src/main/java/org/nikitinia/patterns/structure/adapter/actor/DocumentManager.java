package org.nikitinia.patterns.structure.adapter.actor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DocumentManager {

    public void saveDocument() {
        log.info("Save");
    }

    public void updateDocument() {
        log.info("Update");
    }

    public void loadDocument() {
        log.info("Load");
    }

    public void deleteDocument() {
        log.info("Delete");
    }


}