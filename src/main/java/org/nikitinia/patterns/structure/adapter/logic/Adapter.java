package org.nikitinia.patterns.structure.adapter.logic;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;
import org.nikitinia.patterns.structure.adapter.actor.DocumentManager;

@AllArgsConstructor
public class Adapter implements DocumentDatabase {

    private DocumentManager documentManager;


    @Override
    public void insert() {
        documentManager.saveDocument();
    }

    @Override
    public void select() {
        documentManager.loadDocument();
    }

    @Override
    public void update() {
        documentManager.updateDocument();
    }

    @Override
    public void remove() {
        documentManager.deleteDocument();
    }
}
