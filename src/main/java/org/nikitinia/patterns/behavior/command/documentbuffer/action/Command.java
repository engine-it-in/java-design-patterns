package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import org.nikitinia.domain.model.documents.Document;

public abstract class Command {

    /*
     * Object for command
     * */
    public Document document;

    public Command(Document document) {
        this.document = document;
    }

    /*
     * For state object
     * */
    private String backUp;

    /*
     * Get state object
     * */
    void backUp() {

        backUp = document.getTextField().getText();
    }

    /*
     * Undo for state object
     * */
    public void undo() {
        if (backUp != null) {
            /*
             * If backUp not null -> revert state for text
             * */
            document.getTextField().setText(backUp);
        } else {
            /*
             * If backUp null -> clean bufer
             * */
            document.getTextField().setBuffer(null);
        }
    }

    /*
     * It is we will do with object
     * */
    public abstract boolean execute();

}