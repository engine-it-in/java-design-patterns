package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import lombok.Getter;
import org.nikitinia.patterns.behavior.command.documentbuffer.actor.Command;

import java.util.Stack;

/**
 * Что -> Журнал работы с действиями команд;
 * Для чего -> Для записи команд;
 * Реализация -> стек -> История линейна и мы записываем новое поверх старого;
 * Ценность -> Мы всегда имеем консистентную историю изменений команды;
 */

public class CommandHistory {

    @Getter
    private Stack<Command> historyCommand = new Stack<>();

    public void push(Command command) {
        historyCommand.push(command);
    }

    public Command pop() {
        return historyCommand.pop();
    }

    public boolean isEmpty() {
        return historyCommand.isEmpty();
    }

}
