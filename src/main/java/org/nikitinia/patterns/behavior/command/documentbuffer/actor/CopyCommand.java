package org.nikitinia.patterns.behavior.command.documentbuffer.actor;

import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Конкретная реализация общей структуры команды;
 * Для чего -> Для инкапсуляции логики выполняемой команды;
 * Реализация -> В виде конкретного объекта, который принимает решение о том, что нужно делать;
 * Ценность -> Все действия делегируются конкретному объекту. Четкое разделение обязанности между родителем и потомком;
 */
public class CopyCommand extends Command {

    public CopyCommand(Document document) {
        super(document);
    }

    @Override
    public boolean execute() {
        document.getTextField().setBuffer(
                document.getTextField().getText());
        return true;
    }
}
