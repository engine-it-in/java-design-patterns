package org.nikitinia.patterns.behavior.command.run;

import org.nikitinia.patterns.behavior.command.action.DocumentState;
import org.nikitinia.patterns.behavior.command.action.Flip;
import org.nikitinia.patterns.behavior.command.actor.TurnOffDocument;
import org.nikitinia.patterns.behavior.command.actor.TurnOnDocument;

public class Program {

    public static void main(String[] args) {

        DocumentState documentState = new DocumentState();

        Flip flip = new Flip(
                new TurnOnDocument(documentState),
                new TurnOffDocument(documentState));

        flip.flipOn();
        flip.flipOff();

    }

}
