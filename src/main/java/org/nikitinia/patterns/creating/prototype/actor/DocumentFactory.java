package org.nikitinia.patterns.creating.prototype.actor;

import lombok.AllArgsConstructor;

/**
 * Что -> Создание копии объекта;
 * Для чего -> Реализация прототипирования;
 * Реализация -> Класс с атрибутом объекта, с которого создается прототип;
 * Ценность -> Агрегация прототипируемого объекта;
 */
@AllArgsConstructor
public class DocumentFactory {

    PatternDocument patternDocument;

    public PatternDocument cloneShape() {
        return patternDocument.copy();
    }

}
