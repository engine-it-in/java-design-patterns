package org.nikitinia.patterns.structure.proxy.logic;

import org.nikitinia.patterns.structure.proxy.actor.ProxyDocument;
import org.nikitinia.patterns.structure.proxy.action.PrintForm;
import org.nikitinia.util.InputValue;

public class Program {

    public static void main(String[] args) {

        PrintForm printForm = new ProxyDocument(new InputValue().getDoubleValue());
        printForm.display();

    }

}
