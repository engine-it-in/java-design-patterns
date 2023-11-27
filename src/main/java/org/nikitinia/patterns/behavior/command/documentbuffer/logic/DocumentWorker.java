package org.nikitinia.patterns.behavior.command.documentbuffer.logic;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentbuffer.action.Command;
import org.nikitinia.patterns.behavior.command.documentbuffer.action.CopyCommand;
import org.nikitinia.patterns.behavior.command.documentbuffer.action.PasteCommand;

/*
* Здесь реализуем логику наших действий
* */
public class DocumentWorker {

    /*
    * Нам будет нужна история.
    * */
    private final CommandHistory commandHistory = new CommandHistory();

    public void start(Document document) {
        /*Печатаем содержимое документа*/
        System.out.println("*--New Document--*");
        System.out.println(document.getTextField().toString());

        /*Выполняем копирование вставку и смотрим на документ*/
        System.out.println("*--Document after put come text in buffer--*");
        executeCommand(new CopyCommand(document));
        executeCommand(new PasteCommand(document));
        System.out.println(document.getTextField().toString());

        /*Откатываем все сделанное над документом*/
        undo();
        System.out.println("*--Document after revert state--*");
        System.out.println(document.getTextField().toString());
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