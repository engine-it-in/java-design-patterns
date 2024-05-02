package org.nikitinia.patterns.creating.factorymethod.actor;


/**
 * Что -> Оповещение для конкретного типа документа;
 * Для чего -> Реализация требуемой логики;
 * Реализация -> Конкретный класс, имплементирующий интерфейс и переопределяющий метод по-умолчанию;
 * Ценность -> Регламентация типа класса и переопределение требуемой логики;
 */
public class MediaDocument implements Document {
    @Override
    public void notifyUser() {
        System.out.println("Notify, what  media document send...");
    }
}
