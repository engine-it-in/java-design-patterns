package org.nikitinia.patterns.behavior.command.documentbuffer.logic;

import org.nikitinia.patterns.behavior.command.documentbuffer.action.Command;

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
