package org.nikitinia.patterns.behavior.state.run;

import org.nikitinia.patterns.behavior.state.action.DocumentActivity;
import org.nikitinia.patterns.behavior.state.actor.DocumentStart;
import org.nikitinia.patterns.behavior.state.context.DocumentContext;

import java.util.logging.Logger;

public class Program {

    static Logger logger;

    public static void main(String[] args) {
        DocumentActivity documentActivity = new DocumentStart();
        DocumentContext documentContext = new DocumentContext();
        documentContext.setDocumentActivity(documentActivity);

        for (int i = 0; i < 10; i++) {

            documentContext.doAction();
            documentContext.changeAction();
        }
    }

}
