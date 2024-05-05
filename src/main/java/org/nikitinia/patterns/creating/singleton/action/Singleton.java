package org.nikitinia.patterns.creating.singleton.action;

import lombok.ToString;

/**
 * Что -> ?
 * Для чего -> ?
 * Реализация -> ?
 * Ценность -> ?
 */
@ToString
public final class Singleton {

    private static Singleton singleton;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (singleton == null) {
            singleton = new Singleton(value);

        }
        return singleton;
    }

}
