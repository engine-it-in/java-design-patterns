package org.nikitinia.patterns.creating.factorymethod.actor;


/**
 * Что -> Интерфейс, который регламентирует работу по оповещению;
 * Для чего -> Общий контракт действий;
 * Реализация -> Интерфейс с реализацией по-умолчанию, которую можно будет переопределить;
 * Ценность -> Регламентация требуемого действия;
 */
public interface Document {
    default void notifyUser() {
        System.out.println("Notify, what document send...");
    }
}
