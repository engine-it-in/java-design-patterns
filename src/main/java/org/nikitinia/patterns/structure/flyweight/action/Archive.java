package org.nikitinia.patterns.structure.flyweight.action;

import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Действия легковеса;
 * Для чего -> Контракт легковеса;
 * Реализация -> Интерфейс;
 * Ценность -> Регламентация действий;
 */
public interface Archive {

    void archive (Document document);

}
