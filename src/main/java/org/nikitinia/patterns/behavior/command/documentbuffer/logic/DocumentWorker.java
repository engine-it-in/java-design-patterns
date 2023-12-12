package org.nikitinia.patterns.behavior.command.documentbuffer.logic;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentbuffer.action.Command;
import org.nikitinia.patterns.behavior.command.documentbuffer.action.CopyCommand;
import org.nikitinia.patterns.behavior.command.documentbuffer.action.PasteCommand;

/*
 * Что -> Демонстрационный класс, который запускает общую логику взаимодействия классов ;
 * Для чего -> Для запуска логики демонстрации;
 * Реализация -> По сути, такая логика реализации является демонстрацией шаблона - посредник, о котором мы поговорим позднее;
 * */
@Slf4j
public class DocumentWorker {

    /*
    * Нам будет нужна история.
    * */
    @Getter
    private final CommandHistory commandHistory = new CommandHistory();

    public void start(Document document) {
        /*Печатаем содержимое документа*/
        log.info("*--New Document--*");
        log.info(document.getTextField().toString());

        /*Выполняем копирование вставку и смотрим на документ*/
        log.info("*--Document after put come text in buffer--*");
        executeCommand(new CopyCommand(document));
        executeCommand(new PasteCommand(document));
        log.info(document.getTextField().toString());

        /*Откатываем все сделанное над документом*/
        undo();
        log.info("*--Document after revert state--*");
        log.info(document.getTextField().toString());
        /*Смотрим на содержимое документа*/
    }

    /*Выполняем конкретные команды и записываем их в историю*/
    private void executeCommand(Command command) {
        if (command.execute()) {
            commandHistory.push(command);
        }
    }

    /*Откатываем все команды и возвращаем историю к состоянию - 0*/
    private void undo() {
        while (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            if (command != null) {
                command.undo();
            }
        }
    }

}