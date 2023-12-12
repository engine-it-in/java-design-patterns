package org.nikitinia.patterns.behavior.mediator.logic;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.actor.User;


/*
 * Что -> Система обмена документами, из которой можно отправить любой документ. Абстрвакция;
 * Для чего -> Определяет общую ответсвенность системы;
 * Реализация -> Интерфейс;
 * В чем выгода -> Декларируем возможности любой создаваемой системы;
 * */
public interface DocumentSystem {

    /*
    * В частности - отправку документов
    * */
    void sendDocument(Document document, User user);
}
