package org.nikitinia.patterns.behavior.command.action;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.behavior.command.action.Command;

@AllArgsConstructor
public class Flip {

    Command on;
    Command off;


    public void flipOff() {
        off.execute();
    }

    public void flipOn() {
        on.execute();
    }

}
