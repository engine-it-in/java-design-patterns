package org.nikitinia.patterns.behavior.iterator.action;

/**
 * Что -> Итератор, предоставляющий методы для работы с коллекцией;
 * Для чего -> Декларирование ответственности итератор;
 * Реализация -> Интерфейс с дженериком;
 * Ценность -> Гибкое масштабирование развития итератора;
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
