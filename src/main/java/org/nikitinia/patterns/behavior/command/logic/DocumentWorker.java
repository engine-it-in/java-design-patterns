package org.nikitinia.patterns.behavior.command.logic;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.action.Command;
import org.nikitinia.patterns.behavior.command.action.CopyCommand;
import org.nikitinia.patterns.behavior.command.action.PasteCommand;

public class DocumentWorker {

    private final CommandHistory commandHistory = new CommandHistory();

    public void start(Document document) {
        System.out.println("*--New Document--*");
        System.out.println(document.getTextField().toString());

        System.out.println("*--Document after put come text in buffer--*");
        executeCommand(new CopyCommand(document));
        executeCommand(new PasteCommand(document));
        System.out.println(document.getTextField().toString());
        undo();
        System.out.println("*--Document after revert state--*");
        System.out.println(document.getTextField().toString());
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
