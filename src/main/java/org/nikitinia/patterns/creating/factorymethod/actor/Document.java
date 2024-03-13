package org.nikitinia.patterns.creating.factorymethod.actor;


/**
 * Что -> ;
 * Для чего -> ;
 * Реализация -> ;
 * В чем выгода -> ;
 */
public interface Document {
    default void notifyUser() {
        System.out.println("Notify, what document send...");
    }
}
