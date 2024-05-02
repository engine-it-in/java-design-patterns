package org.nikitinia.patterns.behavior.observer.action;

/**
 * Что -> Интерфейс управления подписчиками;
 * Для чего -> Регламентация того, что делать с подписчиками;
 * Реализация -> Интерфейс с методами воздействия на подписчиков;
 * Ценность -> Реализация этого оповещения будет выполняться в издателе;
 */
public interface Observed {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String action);

}
