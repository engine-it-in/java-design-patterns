package org.nikitinia.patterns.behavior.mediator.actor;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.action.DocumentSystem;

/**
 * Что -> Наследник пользователя. Администратор;
 * Для чего -> Наследует общую логику и визуализирует отправляемый документ;
 * Реализация -> Реализация логики;
 * Ценность -> Разделение функций с сохранением ответсвенности;
 */
public class Admin extends User {

    public Admin(DocumentSystem documentSystem, String name) {
        super(documentSystem, name);
    }

    @Override
    public void visualizeDocument(Document document) {
        System.out.println("Admin visualize " + document);
    }
}
