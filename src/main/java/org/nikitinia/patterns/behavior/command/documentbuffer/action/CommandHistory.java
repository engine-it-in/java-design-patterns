package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import lombok.Getter;
import org.nikitinia.patterns.behavior.command.documentbuffer.actor.Command;

import java.util.Stack;

/*
 * Что -> Журнал работы с действиями команд;
 * Для чего -> Для записи команд;
 * Реализация -> стек -> История линейна и мы записываем новое поверх старого;
 * В чем выгода -> Мы всегда имеем консистентную историю изменений команды;
 * */

public class CommandHistory {

    /*Сюда будем записывать историю действий*/
    @Getter
    private Stack<Command> historyCommand = new Stack<>();

    /*Положим новую историческую запись*/
    public void push(Command command) {
        historyCommand.push(command);
    }

    /*Если потребуется, то возьмем последнюю положенную запись*/
    public Command pop() {
        return historyCommand.pop();
    }

    /*Проверим, есть ли что-то записанное в истории*/
    public boolean isEmpty() {
        return historyCommand.isEmpty();
    }

}
