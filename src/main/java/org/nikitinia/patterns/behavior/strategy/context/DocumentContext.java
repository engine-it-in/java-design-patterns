package org.nikitinia.patterns.behavior.strategy.context;

import lombok.Setter;
import org.nikitinia.patterns.behavior.strategy.action.Strategy;

public class DocumentContext {

    @Setter
    Strategy strategy;

    public void doAction() {
        strategy.doAction();
    }

}
