package org.nikitinia.patterns.behavior.command.action;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.behavior.command.logic.DocumentState;

@AllArgsConstructor
public class TurnOffDocument implements Command {

    DocumentState documentState;
    @Override
    public void execute() {
        documentState.off();
    }
}
