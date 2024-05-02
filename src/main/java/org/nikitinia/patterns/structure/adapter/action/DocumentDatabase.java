package org.nikitinia.patterns.structure.adapter.action;

import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Интерфейс CRUD для работы с объектами базой документов;
 * Для чего -> Инкапсуляция контракта на работу с базой документов;
 * Реализация -> Интерфейс с методами;
 * Ценность -> Гибкая настройка способов работы над документами;
 */
public interface DocumentDatabase {

    void insert(Document document);
    Document select(Double number);
    void update(Document document);
    void remove(Document document);
    void stateDocumentMap();

}
