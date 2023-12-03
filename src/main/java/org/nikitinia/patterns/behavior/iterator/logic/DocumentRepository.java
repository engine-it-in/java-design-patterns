package org.nikitinia.patterns.behavior.iterator.logic;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.action.Collection;
import org.nikitinia.patterns.behavior.iterator.action.Iterator;

import java.util.List;

public class DocumentRepository implements Collection {
    private DocumentIterator documentIterator;

    public DocumentRepository(List<Document> documentList) {
        this.documentIterator = new DocumentIterator(documentList);
    }

    @Override
    public Iterator getIterator() {
        return documentIterator;
    }

}
