package org.nikitinia.patterns.creating.factorymethod.actor;


/**
 * Что -> ;
 * Для чего -> ;
 * Реализация -> ;
 * В чем выгода -> ;
 */
public class MediaDocument implements Document {
    @Override
    public void notifyUser() {
        System.out.println("Notify, what  media document send...");
    }
}
