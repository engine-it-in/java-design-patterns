package org.nikitinia.patterns.behavior.mediator.logic;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.actor.Admin;
import org.nikitinia.patterns.behavior.mediator.actor.Operator;
import org.nikitinia.patterns.behavior.mediator.actor.User;

import java.util.ArrayList;
import java.util.List;

/*
* Конкретный класс, который реализует отправку документов, реализует логику медиатора
* Аудио система отправки документов показана для примера. Тут мы специфицирыем, как именно отправляются документы.
* Это класс посредник, в котором установлены связи между нашими участника и совершаемыми действиями.
* */
public class AudioDocumentSystem implements DocumentSystem {

    /*
    * Отдельно выделим админ, который будет реализовывать определенные функции
    * */
    User admin;

    /*
    * Пользователи участники - отправляющие и получающие документы.
    * */
    List<User> users = new ArrayList<>();


    /*
    * Устанавливаем адина системы. Если переданный пользователь не является админом - оповещаем об этом.
    * */
    public void setAdmin(User admin) {
        if (admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Not right");
        }
    }

    /*
    * Добавлять пользователя может только админ. Если админа нет, то добавлять других пользователей некому
    * */
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
        /*Админ по своему отправляет документ*/
        if (sender instanceof Admin) {
            for (User user : users) {
                user.visualizeDocument(document);
            }
        }
        /*Пользователи участники - по своему*/
        if (sender instanceof Operator) {
            for (User user : users) {
                if (user != sender && sender.isEnabled()) {
                    user.visualizeDocument(document);
                }
            }
            /*Если админ есть - то он по свеому визуализирует документ*/
            if (admin.isEnabled()) {
                admin.visualizeDocument(document);
            }
        }
    }
}
