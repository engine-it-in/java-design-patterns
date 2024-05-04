package org.nikitinia.patterns.behavior.strategy.action;

import org.nikitinia.domain.model.documents.Document;

import java.util.List;

/**
 * Что -> Интерфейс, регламентирующий действия, которые должны выполняться с помощью стратегии;
 * Для чего -> Выделяем в отдельный компонент стартегические действия, которые будут имплементированы в классы реализаторы;
 * Реализация -> Интерфейс;
 * Ценность -> Возможность общения с классами через общий компонент;
 */
public interface Sorting {

    void findDocument(List<Document> documentList);
}
