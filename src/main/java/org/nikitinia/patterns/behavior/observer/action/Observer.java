package org.nikitinia.patterns.behavior.observer.action;

import org.nikitinia.domain.model.documents.Document;

import java.util.List;

/**
 * Что -> Интерфейс наблюдатель;
 * Для чего -> Оповещение о том, что с объектом что-то произошло;
 * Реализация -> Интерфейс;
 * Ценность -> Способ реакции на события;
 */
public interface Observer {

    void eventListener(List<Document> documents, String action);

}
