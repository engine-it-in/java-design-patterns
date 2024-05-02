package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Класс для создания и просмотра содержимого снимка;
 * Для чего -> Конкретный класс, ответсенный за созданием снимка целевого объекта;
 * Реализация -> Класс обертка для целевого классса и его снимка;
 * Ценность -> Сохранение инкапсуляции и распределение ответсенности по профильным компонентам;
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
