package org.nikitinia.patterns.behavior.observer.actor;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.observer.action.Observer;

import java.util.List;

/**
 * Что -> Подписчики;
 * Для чего -> Оповещение о событиях, выполненных издателем;
 * Реализация -> Класс, реализующий работу с произошедшими событиями;
 * Ценность -> Подписчик отвечает только за то, что должно происходит с самой подпиской;
 */
@AllArgsConstructor
public class Subscriber implements Observer {

    private String name;

    @Override
    public void eventListener(List<Document> documents, String action) {
        System.out.println(name + " " + documents + " " + action);
    }
}
