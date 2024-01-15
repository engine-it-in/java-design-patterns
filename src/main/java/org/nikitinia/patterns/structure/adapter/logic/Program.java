package org.nikitinia.patterns.structure.adapter.logic;

import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;
import org.nikitinia.patterns.structure.adapter.actor.DocumentManager;

public class Program {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();
        DocumentDatabase dataBase = new Adapter(documentManager);

        dataBase.insert();
        dataBase.select();
        dataBase.update();
        dataBase.remove();
    }
}
