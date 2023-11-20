package org.nikitinia.patterns.behavior.mediator.run;

import org.nikitinia.patterns.behavior.mediator.action.User;
import org.nikitinia.patterns.behavior.mediator.actor.Employee;
import org.nikitinia.patterns.behavior.mediator.logic.Mediator;

public class Program {

    public static void main(String[] args) {
        Mediator chat = new Mediator();

        User employeeFirst = new Employee(chat, "First");

        User employeeSecond = new Employee(chat, "Second");

        User employeeThird = new Employee(chat, "Third");

        User boss = new Employee(chat, "Boss");

        chat.addEmployee(employeeFirst);
        chat.addEmployee(employeeSecond);
        chat.addEmployee(employeeThird);
        chat.setBoss(boss);

        chat.sendMessage("first message from employeeFirst", employeeFirst);
        chat.sendMessage("second message from employeeSecond", employeeSecond);
        chat.sendMessage("third message from employeeThird", employeeThird);
    }
}
