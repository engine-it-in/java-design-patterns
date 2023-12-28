package org.nikitinia.patterns.behavior.strategy.action;

import org.nikitinia.domain.model.documents.Document;

public interface Strategy {

    void doAction(Document document);
}
