package org.nikitinia.patterns.structure.adapter.logic;

import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;

public class Program {
    public static void main(String[] args) {
        DocumentDatabase dataBase = new Adapter();
        dataBase.insert();
        dataBase.select();
        dataBase.update();
        dataBase.remove();
    }
}
