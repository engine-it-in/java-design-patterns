package org.nikitinia.patterns.structure.flyweight.action;

import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Интерфейс для выделения действий легковеса;
 * Для чего -> Контракт по которому можно выделить действия легковеса;
 * Реализация -> Интерфейс с внутренними параметрами логики действий;
 * Ценность -> Контракт легковесов;
 */
public interface Archive {

    void archive (Document document);

}
