package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import org.nikitinia.domain.model.documents.Document;

/*
 * Что -> Это сама "команда";
 * Для чего -> Этот абстрактный класс инкапсулирует корневую логику команды;
 * Реализация -> Создана в виде абстрактного класса, потому что удобно определить основные действия, которые могут не изменяться;
 * В чем выгода - Уменьшаем копирование и переиспользуем корневую логику;
 * В чем потенциальные проблемы:
 *   - потенциальные проблемы могут быть с уже определенными шагами;
 *   - это уменьшает гибкость и навязывает определенное формат реализации;
 *   - конкретные реализации могут не укладываться в сделанные реализации;
 *   - использование абстрактного класса должно быть обосновано контекстом;
 * */
public abstract class Command {

    /*
     * Объект, над которым мы совершаем действия;
     * */
    public Document document;

    public Command(Document document) {
        this.document = document;
    }

    /*
     * Для фиксации текста, который складываем в буфер;
     * */
    private String backUp;

    /*
     * Сохранение теста для передачи в буфер;
     * */
    void backUp() {
        backUp = document.getTextField().getText();
    }

    /*
     * Устанавливаем текстовое поле в состояние бэкапа, то есть, восстанавливаем бэкап значения;
     * */
    public void undo() {
        if (backUp != null) {
            document.getTextField().setText(backUp);
        } else {
            document.getTextField().setBuffer(null);
        }
    }

    /*
     * Этот метод необходимо переопределить для принятия решения о том, когда выполнять команду;
     * */
    public abstract boolean execute();

}