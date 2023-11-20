package org.nikitinia.patterns.behavior.command.run;

import org.nikitinia.patterns.behavior.command.logic.DocumentState;
import org.nikitinia.patterns.behavior.command.action.TurnOnDocument;
import org.nikitinia.patterns.behavior.command.logic.Flip;
import org.nikitinia.patterns.behavior.command.action.TurnOffDocument;

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
