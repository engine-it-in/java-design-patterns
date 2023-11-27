package org.nikitinia.patterns.behavior.command.documentbuffer.run;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.behavior.command.documentbuffer.logic.DocumentWorker;

public class Program {
    public static void main(String[] args) {
        /*Запускаем нашу логику*/
        new DocumentWorker()
                /*Передаем документ, над буфером которого будут совершаться действия*/
                .start(DocumentCreator.documentBuild());
    }

}