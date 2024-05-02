package org.nikitinia.patterns.behavior.command.documentbuffer.actor;

import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Реализация общей структуры команды;
 * Для чего -> Инкапсуляции логики выполняемой команды;
 * Реализация -> Объекта, который принимает решение о том, что нужно делать;
 * Ценность -> Все действия делегируются конкретному объекту. Четкое разделение обязанности между родителем и потомком;
 */
public class PasteCommand extends Command {

    public PasteCommand(Document document) {
        super(document);
    }

    @Override
    public boolean execute() {

        if (document.getTextField().getBuffer() == null) {
            return false;
        } else {
            backUp();
            document.getTextField().setText(document.getTextField().getBuffer());
            return true;
        }

    }
}
