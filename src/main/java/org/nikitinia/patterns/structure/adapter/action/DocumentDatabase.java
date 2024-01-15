package org.nikitinia.patterns.structure.adapter.action;

import org.nikitinia.domain.model.documents.Document;

public interface DocumentDatabase {

    void insert(Document document);
    void select(Document document);
    void update(Document document);
    void remove(Document document);

}
