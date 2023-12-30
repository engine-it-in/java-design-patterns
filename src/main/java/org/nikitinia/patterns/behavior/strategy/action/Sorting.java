package org.nikitinia.patterns.behavior.strategy.action;

import org.nikitinia.domain.model.documents.Document;

import java.util.List;

public interface Sorting {

    void findDocument(List<Document> documentList);
}
