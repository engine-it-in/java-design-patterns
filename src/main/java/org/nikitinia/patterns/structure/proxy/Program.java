package org.nikitinia.patterns.structure.proxy;

import org.nikitinia.util.InputValue;

public class Program {

    public static void main(String[] args) {

        InputValue inputValue = new InputValue();

        PrintForm printForm = new ProxyDocument(inputValue.getDoubleValue());
        printForm.display();

    }

}
