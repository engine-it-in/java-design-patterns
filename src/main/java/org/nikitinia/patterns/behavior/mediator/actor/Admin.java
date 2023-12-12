package org.nikitinia.patterns.behavior.mediator.actor;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.logic.DocumentSystem;

/*
 * Что -> Наследник пользователя. Админ;
 * Для чего -> Наследует общую логику и по своему визуализирует отправляемый документ;
 * Реализация -> Конкретный класс, отвечающий за дайствия оператора;
 * В чем выгода -> Разделение функций с сохранением ответсвенности;
 * */
public class Admin extends User {

    /*
    * Общая логика инстанциируется через конструтор. Класса
    * */
    public Admin(DocumentSystem documentSystem, String name) {
        super(documentSystem, name);
    }

    @Override
    public void visualizeDocument(Document document) {
        System.out.println("Admin visualize " + document);
    }
}
