package org.nikitinia.patterns.behavior.Strategy.actor;

import org.nikitinia.patterns.behavior.Strategy.action.Strategy;

public class DocumentStart implements Strategy {

    @Override
    public void doAction() {
        System.out.println("Document Start");
    }
}
