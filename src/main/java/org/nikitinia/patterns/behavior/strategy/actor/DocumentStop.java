package org.nikitinia.patterns.behavior.strategy.actor;

import org.nikitinia.patterns.behavior.strategy.action.Strategy;

public class DocumentStop implements Strategy {
    @Override
    public void doAction() {
        System.out.println("Document Stop");
    }
}
