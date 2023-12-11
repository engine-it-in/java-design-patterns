package org.nikitinia.patterns.behavior.mediator.logic;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.actor.User;

/*
* Система обмена документами, из которой можно отправить любой документ.
* Система в целом, которая не существует, но которая предполагает выполнение определенных действий.
* */
public interface DocumentSystem {

    /*
    * В частности - отправку документов
    * */
    void sendDocument(Document document, User user);
}
