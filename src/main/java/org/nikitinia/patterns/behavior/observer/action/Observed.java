package org.nikitinia.patterns.behavior.observer.action;

/**
 * Что -> Интерфейс подписчиков;
 * Для чего -> Регламентация действий подписчиков;
 * Реализация -> Интерфейс;
 * Ценность -> Механизм управления подписчиками;
 */
public interface Observed {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String action);

}
