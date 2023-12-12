package org.nikitinia.patterns.behavior.mediator.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.logic.DocumentSystem;

/*
 * Что -> Каркас для участников взаимодействия;
 * Для чего -> Унифицированная общая логика с основными атрибутами участников;
 * Реализация -> Класс реализован изменяемым, чтобы управлять его состоянием и тем самым, задавать логику поведения дочерних объектов;
 * В чем выгода -> Единая точка работы с дочерними объектами, содержащая основные функции;
  * */
public abstract class User {


    /*
    * Ссылка на систему обмена документами
    * */
    DocumentSystem documentSystem;


    /*
     * Имя пользователя
     * */
    @Getter
    String name;

    /*
     * Признак доступности пользователя для участия в чате
     * */
    @Getter
    @Setter
    boolean isEnabled = true;

    public User(DocumentSystem documentSystem, String name) {
        this.documentSystem = documentSystem;
        this.name = name;
    }

    /*
     * Отправляем документ в систему. Логика отправки единам
     * */
    public void sendDocument(Document document) {
        documentSystem.sendDocument(document, this);
    }


    /*
    * Визуализация конкретного документа. Каждый наследник будет визуализировать так, как считает нужным
    * */
    public abstract void visualizeDocument(Document document);

}
