package org.nikitinia.patterns.behavior.command.action;

import org.nikitinia.domain.model.documents.Document;

public class CopyCommand extends Command {

    public CopyCommand(Document document) {
        super(document);
    }

    /*
     * Logic for copy data in document
     * */
    @Override
    public boolean execute() {
        document.getTextField().setBuffer(
                document.getTextField().getText());
        return true;
    }
}
