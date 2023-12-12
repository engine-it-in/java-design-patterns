package org.nikitinia.patterns.behavior.mediator.actor;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.logic.DocumentSystem;

/*
 * Что -> Наследник пользователя. Оператор;
 * Для чего -> Наследует общую логику и по своему визуализирует отправляемый документ;
 * Реализация -> Конкретный класс, отвечающий за дайствия оператора;
 * В чем выгода -> Разделение функций с сохранением ответсвенности;
 * */
public class Operator extends User {

    public Operator(DocumentSystem documentSystem, String name) {
        super(documentSystem, name);
    }

    @Override
    public void visualizeDocument(Document document) {
        System.out.println("Operator visualize " + document);
    }
}
