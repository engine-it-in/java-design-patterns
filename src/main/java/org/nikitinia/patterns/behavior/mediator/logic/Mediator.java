package org.nikitinia.patterns.behavior.mediator.logic;

import lombok.Setter;
import org.nikitinia.patterns.behavior.mediator.action.User;
import org.nikitinia.patterns.behavior.mediator.action.Chat;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements Chat {
    List<User> employeeList = new ArrayList<>();

    @Setter
    User boss;

    public void addEmployee(User user) {
        employeeList.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: employeeList) {
            if (u != user) {
                u.getMessage(message);
            }
            boss.getMessage(message);

        }
    }
}
