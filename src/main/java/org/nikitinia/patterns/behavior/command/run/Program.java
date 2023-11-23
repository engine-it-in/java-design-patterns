package org.nikitinia.patterns.behavior.command.run;

import org.nikitinia.domain.creator.Creator;
import org.nikitinia.patterns.behavior.command.logic.DocumentWorker;

public class Program {
    public static void main(String[] args) {
        new DocumentWorker()
                .start(Creator.documentCreator());
    }


}
