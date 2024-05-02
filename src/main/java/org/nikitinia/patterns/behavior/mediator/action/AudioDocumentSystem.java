package org.nikitinia.patterns.behavior.mediator.action;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.actor.Admin;
import org.nikitinia.patterns.behavior.mediator.actor.Operator;
import org.nikitinia.patterns.behavior.mediator.actor.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Что -> Конкретный класс, который реализует отправку документов, реализует логику медиатора;
 * Для чего -> Определяет общую ответсвенность системы;
 * Реализация -> Аудио система отправки документов показана для примера. Тут мы специфицируем, как именно отправляются документы;
 * Ценность -> Это класс посредник mediator, в котором установлены связи между нашими участника и совершаемыми действиями;
 */

public class AudioDocumentSystem implements DocumentSystem {

    User admin;

    List<User> users = new ArrayList<>();


    public void setAdmin(User admin) {
        if (admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Not right");
        }
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("Not admin in system");
        }
        if (user instanceof Operator) {
            users.add(user);
        } else {
            throw new RuntimeException("Admin can not do in another system");
        }

    }


    @Override
    public void sendDocument(Document document, User sender) {
        if (sender instanceof Admin) {
            for (User user : users) {
                user.visualizeDocument(document);
            }
        }
        if (sender instanceof Operator) {
            for (User user : users) {
                if (user != sender && sender.isEnabled()) {
                    user.visualizeDocument(document);
                }
            }
            if (admin.isEnabled()) {
                admin.visualizeDocument(document);
            }
        }
    }
}