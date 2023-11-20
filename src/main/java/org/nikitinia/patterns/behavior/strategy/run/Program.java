package org.nikitinia.patterns.behavior.strategy.run;

import org.nikitinia.patterns.behavior.strategy.actor.DocumentStart;
import org.nikitinia.patterns.behavior.strategy.actor.DocumentStop;
import org.nikitinia.patterns.behavior.strategy.context.DocumentContext;

public class Program {

    public static void main(String[] args) {
        DocumentContext documentContext = new DocumentContext();

        documentContext.setStrategy(new DocumentStart());
        documentContext.doAction();

        documentContext.setStrategy(new DocumentStop());
        documentContext.doAction();

        documentContext.setStrategy(new DocumentStart());
        documentContext.doAction();

    }

}
