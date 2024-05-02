package org.nikitinia.patterns.behavior.command.documentbuffer.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> "Команда";
 * Для чего -> Этот абстрактный класс реализующий корневую логику команды;
 * Реализация -> Создана в виде абстрактного класса. Определяет основные действия, которые будут не изменяться;
 * Ценность -> Уменьшаем копирование и переиспользуем логику;
 */
@Getter
public abstract class Command {

    public Document document;

    public Command(Document document) {
        this.document = document;
    }

    private String backUp;

    void backUp() {
        backUp = document.getTextField().getText();
    }

    public void undo() {
        if (backUp != null) {
            document.getTextField().setText(backUp);
        } else {
            document.getTextField().setBuffer(null);
        }
    }

    public abstract boolean execute();

}