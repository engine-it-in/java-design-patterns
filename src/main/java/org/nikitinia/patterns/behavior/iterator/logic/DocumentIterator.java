package org.nikitinia.patterns.behavior.iterator.logic;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.action.Iterator;

import java.util.List;

public class DocumentIterator implements Iterator {

    private final List<Document> documentList;
    private int position;

    public DocumentIterator(List<Document> documentList) {
        this.position = 0;
        this.documentList = documentList;
    }

    @Override
    public boolean hasNext() {
        return position < documentList.size();
    }

    @Override
    public Document next() {
        Document document = documentList.get(position);
        position++;
        System.out.println(document);
        return document;
    }

}
