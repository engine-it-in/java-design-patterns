package org.nikitinia.patterns.behavior.mediator.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.nikitinia.patterns.behavior.mediator.action.User;
import org.nikitinia.patterns.behavior.mediator.action.Chat;

@AllArgsConstructor
public class Employee implements User {

    Chat chat;

    @Getter
    @Setter
    String name;

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " " + message);
    }
}
