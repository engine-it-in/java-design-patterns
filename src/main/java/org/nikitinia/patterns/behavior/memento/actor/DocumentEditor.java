package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Логика работы со снимком;
 * Для чего -> Созданием снимка целевого объекта;
 * Реализация -> Класс обертка для целевого класса и его снимка;
 * Ценность -> Сохранение инкапсуляции и локализация ответственности;
 */
public class DocumentEditor {

    @Setter
    private Document document;

    public Memento memento() {
        System.out.println(document);
        return new Memento(document);
    }

    public void load(Memento memento) {
        document = memento.getDocument();
        System.out.println(document);
    }
}
