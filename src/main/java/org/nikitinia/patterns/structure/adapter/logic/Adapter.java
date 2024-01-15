package org.nikitinia.patterns.structure.adapter.logic;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;
import org.nikitinia.patterns.structure.adapter.actor.DocumentRepository;

@Slf4j
@AllArgsConstructor
public class Adapter extends DocumentRepository implements DocumentDatabase {


    @Override
    public void insert(Document document) {
        save(document);
    }

    @Override
    public Document select(Double number) {
        return load(number);
    }

    @Override
    public void update(Document document) {
        Document updateDocument = select(document.getNumber());
        updateDocument.setStatus(Status.SIGN);
        remove(document);
        insert(updateDocument);
    }

    @Override
    public void remove(Document document) {
        delete(document);
    }

    @Override
    public void stateDocumentMap() {
        if (!getDocumentMap().isEmpty()) {
            getDocumentMap()
                    .forEach((aDouble, document) -> log.info("documentMap contain document with number: {}", aDouble));
        } else {
            log.info("DocumentMap is Empty");
        }

    }
}
