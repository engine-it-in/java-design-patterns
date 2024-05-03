package org.nikitinia.patterns.behavior.iterator.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.action.Iterator;

import java.util.List;

/**
 * Что -> Итератор для документов;
 * Для чего -> Логика перебора документов;
 * Реализация -> Класс;
 * Ценность -> Реализация логики итератора для документов:
 */
public class DocumentIterator implements Iterator {

    @Getter
    private final List<Document> documentList;

    @Getter
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
