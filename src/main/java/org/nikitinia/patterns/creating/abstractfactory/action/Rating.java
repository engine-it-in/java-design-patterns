package org.nikitinia.patterns.creating.abstractfactory.action;

import org.nikitinia.patterns.creating.abstractfactory.action.dictionary.RatingValue;

/**
 * Что -> Интерфейс рейтингования;
 * Для чего -> Контракт действий одного из объектов абстрактной фабрики;
 * Реализация -> Интерфейс;
 * Ценность -> Регламентация объекта, который будет возвращен в числе результирующих объектов абстрактной фабрики;
 */
public interface Rating {

    RatingValue getGrade();

}
