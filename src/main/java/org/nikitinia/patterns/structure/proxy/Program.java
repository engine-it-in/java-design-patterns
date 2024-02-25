package org.nikitinia.patterns.structure.proxy;

public class Program {

    public static void main(String[] args) {

        PrintForm printForm = new ProxyDocument(1.0);
        printForm.display();

    }

}
