package org.nikitinia.patterns.behavior.command.documentbuffer.run;

import org.nikitinia.domain.creator.Creator;
import org.nikitinia.patterns.behavior.command.documentbuffer.logic.DocumentWorker;

public class Program {
    public static void main(String[] args) {
        new DocumentWorker()
                .start(Creator.documentCreator());
    }


}
