package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import org.nikitinia.domain.model.documents.Document;

public class PasteCommand extends Command {

    public PasteCommand(Document document) {
        super(document);
    }

    /*
    * Logic for paste data in document
    * */
    @Override
    public boolean execute() {

        if (document.getTextField().getBuffer().isEmpty()) {
            return false;
        } else {
            backUp();
            document.getTextField().setText(document.getTextField().getBuffer());
            return true;
        }

    }
}
