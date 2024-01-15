package org.nikitinia.patterns.structure.adapter.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;

public class Program {
    public static void main(String[] args) {

        Document document =
                DocumentCreator.documentBuildWithNumber(1.0);

        DocumentDatabase dataBase = new Adapter();

        dataBase.insert(document);
        dataBase.select(document);
        dataBase.update(document);
        dataBase.remove(document);
    }
}
