package org.nikitinia.patterns.creating.singleton.action;

import lombok.ToString;

/**
 * Что -> Реализация логики одиночки;
 * Для чего -> Реализация проверки единственности объекта через единственный публичный метод класса;
 * Реализация -> Класс с приватным конструктором и публичным методом одиночкой;
 * Ценность -> Гарантия наличия единственного инстанса класса;
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
