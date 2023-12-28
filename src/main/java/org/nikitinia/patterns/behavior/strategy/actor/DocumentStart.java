package org.nikitinia.patterns.behavior.strategy.actor;

import org.nikitinia.patterns.behavior.strategy.action.Strategy;

public class DocumentStart implements Strategy {

    @Override
    public void doAction() {

        System.out.println("Document Start");
    }
}
