package org.nikitinia.patterns.creating.factorymethod.actor;


public class MediaDocument implements Document {
    @Override
    public void notifyUser() {
        System.out.println("Notify, what  media document send...");
    }
}
