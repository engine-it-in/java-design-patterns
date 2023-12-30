package org.nikitinia.patterns.behavior.strategy.action;

import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

import java.util.List;

@Setter
public class StrategyClient {

    Sorting strategy;

    public void executeStrategy(List<Document> documentList) {
        strategy.findDocument(documentList);
    }

}
