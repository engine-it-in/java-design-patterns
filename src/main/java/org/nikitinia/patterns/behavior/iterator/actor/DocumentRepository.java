package org.nikitinia.patterns.behavior.iterator.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.action.Collection;
import org.nikitinia.patterns.behavior.iterator.action.Iterator;

import java.util.List;

/**
 * Что -> Класс реализующий связь между конкретным типом объекта и конкретным итератором;
 * Для чего -> Интерфейс для работы с документами;
 * Реализация -> Класс с инетрфейсом в виде коллекции;
 * Ценность -> Публичный класс, который является декларированием того, что может наша программа;
 */
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
