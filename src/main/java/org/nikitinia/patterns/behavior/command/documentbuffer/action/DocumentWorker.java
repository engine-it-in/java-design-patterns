package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentbuffer.actor.Command;
import org.nikitinia.patterns.behavior.command.documentbuffer.actor.CopyCommand;
import org.nikitinia.patterns.behavior.command.documentbuffer.actor.PasteCommand;

/**
 * Что -> Запуск логики взаимодействия классов;
 * Для чего -> Демонстрация;
 * Реализация -> Логика реализации является демонстрацией шаблона - посредник;
 * Ценность -> Реализация в едином месте общей логики взаимодействия;
 */
@Slf4j
public class DocumentWorker {

    @Getter
    private final CommandHistory commandHistory = new CommandHistory();

    public void start(Document document) {
        log.info("*--New Document--*");
        log.info(document.getTextField().toString());

        log.info("*--Document after put come text in buffer--*");
        executeCommand(new CopyCommand(document));
        executeCommand(new PasteCommand(document));
        log.info(document.getTextField().toString());

        undo();
        log.info("*--Document after revert state--*");
        log.info(document.getTextField().toString());
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            commandHistory.push(command);
        }
    }

    private void undo() {
        while (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            if (command != null) {
                command.undo();
            }
        }
    }

}