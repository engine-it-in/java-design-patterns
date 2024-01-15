package org.nikitinia.patterns.structure.adapter.logic;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;
import org.nikitinia.patterns.structure.adapter.actor.DocumentManager;

@AllArgsConstructor
public class Adapter extends DocumentManager implements DocumentDatabase {


    @Override
    public void insert(Document document) {
        saveDocument(document);
    }

    @Override
    public void select(Document document) {
        loadDocument(document);
    }

    @Override
    public void update(Document document) {

        updateDocument(document);
    }

    @Override
    public void remove(Document document) {

        deleteDocument(document);
    }
}
