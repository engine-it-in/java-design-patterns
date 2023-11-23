package org.nikitinia.patterns.behavior.command.logic;

import org.nikitinia.patterns.behavior.command.action.Command;

import java.util.Stack;

public class CommandHistory {

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
