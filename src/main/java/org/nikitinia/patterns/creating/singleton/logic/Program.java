package org.nikitinia.patterns.creating.singleton.logic;

import org.nikitinia.patterns.creating.singleton.action.Singleton;

/**
 * Что -> ?
 * Для чего -> ?
 * Реализация -> ?
 * Ценность -> ?
 */
public class Program {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("x");
        System.out.println(singleton);

        Singleton singletonFirst = Singleton.getInstance("b");
        System.out.println(singletonFirst);
    }

}
