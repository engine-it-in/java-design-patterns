package org.nikitinia.patterns.behavior.strategy.action;

import org.nikitinia.domain.model.documents.Document;

import java.util.List;

public class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(List<Document> documentList) {
        strategy.findDocument(documentList);
    }

}
