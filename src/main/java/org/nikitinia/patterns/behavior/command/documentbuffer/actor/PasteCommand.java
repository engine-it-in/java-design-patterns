package org.nikitinia.patterns.behavior.command.documentbuffer.actor;

import org.nikitinia.domain.model.documents.Document;

/*
 * Что -> Конкретная реализация общей структуры команды;
 * Для чего -> Для инкапсуляции логики выполняемой команды;
 * Реализация -> В виде конкретного объекта, который принимает решение о том, что нужно делать;
 * В чем выгода -> Все действия делегируются конкретному объекту. Четкое разделение обязанности между родителем и потомком;
 * */
public class PasteCommand extends Command {

    /*
     * Ничего дополнительного для создания объекта.
     * Класс потомок только переопределяет отдельное поведение,
     * которое характеризует данный конкретный объект.
     * */
    public PasteCommand(Document document) {
        super(document);
    }

    /*
     * Суть операции вставки - положить значение из буфера в поле, если он заполнен.
     * */
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
