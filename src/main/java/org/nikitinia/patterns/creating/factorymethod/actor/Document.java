package org.nikitinia.patterns.creating.factorymethod.actor;


public interface Document {

    default void notifyUser() {
        System.out.println("Notify, what document send...");
    }
}
