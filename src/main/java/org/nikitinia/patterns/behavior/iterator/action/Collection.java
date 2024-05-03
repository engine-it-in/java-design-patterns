package org.nikitinia.patterns.behavior.iterator.action;

/**
 * Что -> Интерфейс итератора;
 * Для чего -> Итератор может быть реализован для каждого типа по своему;
 * Реализация -> Интерфейс;
 * Ценность -> Повышение гибкости настройки итератора для семейств различных типов;
 */
public interface Collection {

    Iterator getIterator();

}
