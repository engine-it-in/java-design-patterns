package org.nikitinia.patterns.behavior.Strategy.context;

import lombok.Setter;
import org.nikitinia.patterns.behavior.Strategy.action.Strategy;

public class DocumentContext {

    @Setter
    Strategy strategy;

    public void doAction() {
        strategy.doAction();
    }

}
