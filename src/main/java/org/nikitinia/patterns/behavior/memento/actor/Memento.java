package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Что -> "Снимок". Реализация шаблона;
 * Для чего -> Реализация логики.
 * Реализация -> Конкретный класс;
 * Ценность -> Возможность управлять состоянием переданного объекта;
 */
public class Memento {

    Queue<Document> mementoHistory = new LinkedList<>();

    @Getter
    private final Document document;

    public Memento(Document document) {
        this.document = document;
    }

    public void pushHistory(Document document) {
        mementoHistory.add(document);
    }

    public Document pollHistory() {
        return mementoHistory.poll();
    }
}
