package org.nikitinia.patterns.behavior.command.actor;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.behavior.command.action.Command;
import org.nikitinia.patterns.behavior.command.action.DocumentState;

@AllArgsConstructor
public class TurnOnDocument implements Command {

    DocumentState documentState;

    @Override
    public void execute() {
        documentState.on();
    }
}
