package org.nikitinia.patterns.behavior.observer.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.observer.action.Observed;
import org.nikitinia.patterns.behavior.observer.action.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Что -> Издатель;
 * Для чего -> Работает с документами и подписчиками;
 * Реализация -> Класс, реализующий управление контентом и работу с подписчиками;
 * Ценность -> Единая точка управления.
 * Если издателей может быть несколько, то общую логику можно перенести в абстрактуный класс;
 */
@Getter
public class Office implements Observed {

    private final List<Document> documents
            = new ArrayList<>();

    private final List<Observer> subscribes
            = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribes.remove(observer);
    }

    @Override
    public void notifyObserver(String action) {
        for (Observer observer : subscribes) {
            observer.eventListener(documents, action);
        }
    }

    public void addDocument(Document document) {
        documents.add(document);
        notifyObserver("add");
    }

    public void removeDocument(Document document) {
        notifyObserver("remove");
        documents.remove(document);

    }

}