package org.nikitinia.patterns.behavior.iterator.action;

/**
 * Что -> Итератор, который предоставляет методы для работы с коллекцией;
 * Для чего -> Декларирование того, за что отвечает наш итератор;
 * Реализация -> Интерфейс с дженериком;
 * В чем выгода -> Гибкое масштабирование развития самого итератора;
 */
public interface Iterator<T> {


    /*Есть ли следующий элемент?*/
    boolean hasNext();

    /*Дай следующий элемент*/
    T next();
}
