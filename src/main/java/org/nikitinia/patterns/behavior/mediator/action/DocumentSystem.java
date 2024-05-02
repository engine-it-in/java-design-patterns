package org.nikitinia.patterns.behavior.mediator.action;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.actor.User;


/**
 * Что -> Система обмена документами, из которой можно отправить любой документ. Абстрвакция;
 * Для чего -> Определяет общую ответсвенность системы;
 * Реализация -> Интерфейс;
 * Ценность -> Декларируем возможности любой создаваемой системы;
 */
public interface DocumentSystem {

    void sendDocument(Document document, User user);
}