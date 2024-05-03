package org.nikitinia.patterns.behavior.mediator.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.action.DocumentSystem;

/**
 * Что -> Каркас для участников взаимодействия;
 * Для чего -> Общая логика с основными атрибутами;
 * Реализация -> Класс реализован изменяемым, чтобы управлять его состоянием и тем самым, задавать логику поведения наследников;
 * Ценность -> Единая точка работы с наследниками;
 */
public abstract class User {

    DocumentSystem documentSystem;

    @Getter
    String name;

    @Getter
    @Setter
    boolean isEnabled = true;

    public User(DocumentSystem documentSystem, String name) {
        this.documentSystem = documentSystem;
        this.name = name;
    }

    public void sendDocument(Document document) {
        documentSystem.sendDocument(document, this);
    }

    public abstract void visualizeDocument(Document document);

}
