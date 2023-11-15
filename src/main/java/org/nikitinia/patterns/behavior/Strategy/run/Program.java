package org.nikitinia.patterns.behavior.Strategy.run;

import org.nikitinia.patterns.behavior.Strategy.actor.DocumentStart;
import org.nikitinia.patterns.behavior.Strategy.actor.DocumentStop;
import org.nikitinia.patterns.behavior.Strategy.context.DocumentContext;

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
