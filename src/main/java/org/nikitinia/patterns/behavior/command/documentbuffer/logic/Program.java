package org.nikitinia.patterns.behavior.command.documentbuffer.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.behavior.command.documentbuffer.action.DocumentWorker;

public class Program {
    public static void main(String[] args) {
        new DocumentWorker()
                .start(DocumentCreator.documentBuild());
    }

}