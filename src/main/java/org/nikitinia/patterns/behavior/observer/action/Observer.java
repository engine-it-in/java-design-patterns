package org.nikitinia.patterns.behavior.observer.action;

import org.nikitinia.domain.model.documents.Document;

import java.util.List;

/*
 * Что -> Интерфейс наблюдатель;
 * Для чего -> Оповещение о том, что с объектом что-то произошло;
 * Реализация -> Интерфейс с методом оповещения;
 * В чем выгода -> Реализация этого оповещения будет выполняться в подписчиках;
 * */
public interface Observer {

    void eventListener(List<Document> documents, String action);

}
