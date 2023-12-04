package org.nikitinia.patterns.behavior.iterator.logic;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.action.Collection;
import org.nikitinia.patterns.behavior.iterator.action.Iterator;

import java.util.List;

/*
* В этот класс мы делегируем работу с коллекцией
* */
public class DocumentRepository implements Collection {

    @Getter
    private final DocumentIterator documentIterator;

    public DocumentRepository(List<Document> documentList) {
        this.documentIterator = new DocumentIterator(documentList);
    }

    @Override
    public Iterator getIterator() {
        return documentIterator;
    }

}
