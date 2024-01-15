package org.nikitinia.patterns.structure.adapter.logic;

import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;
import org.nikitinia.patterns.structure.adapter.actor.DocumentManager;

public class Adapter extends DocumentManager implements DocumentDatabase {


    @Override
    public void insert() {
        saveDocument();
    }

    @Override
    public void select() {
        loadDocument();
    }

    @Override
    public void update() {
        updateDocument();
    }

    @Override
    public void remove() {
        deleteDocument();
    }
}
