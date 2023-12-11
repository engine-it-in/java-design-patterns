package org.nikitinia.patterns.behavior.mediator.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.logic.DocumentSystem;

/*
* Каркас для участников взаимодействия.
* Унифицированная общая логика с основными атрибутами
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
