package org.nikitinia.patterns.creating.prototype.action;

import org.nikitinia.patterns.creating.prototype.actor.PatternDocument;

/**
 * Что -> Интерфейс, регламентирующий прототипирование;
 * Для чего -> Выделение основного действия, которое приводит к созданию прототипа;
 * Реализация -> Интерфейс;
 * Ценность -> Гибкая регламентация прототипирования;
 */
public interface Copy {

    PatternDocument copy();

}
