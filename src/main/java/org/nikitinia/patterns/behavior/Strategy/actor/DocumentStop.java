package org.nikitinia.patterns.behavior.Strategy.actor;

import org.nikitinia.patterns.behavior.Strategy.action.Strategy;

public class DocumentStop implements Strategy {
    @Override
    public void doAction() {
        System.out.println("Document Stop");
    }
}
