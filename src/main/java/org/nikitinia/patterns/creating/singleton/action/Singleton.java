package org.nikitinia.patterns.creating.singleton.action;

import lombok.ToString;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Реализация логики одиночки;
 * Для чего -> Реализация проверки единственности объекта через единственный публичный метод класса;
 * Реализация -> Класс с приватным конструктором и публичным методом одиночкой;
 * Ценность -> Гарантия наличия единственного инстанса класса;
 */
@ToString
public final class Singleton {

    private static Singleton singleton;
    public Document document;

    private Singleton(Document document) {
        this.document = document;
    }

    public static Singleton getInstance(Document document) {
        if (singleton == null) {
            singleton = new Singleton(document);

        }
        return singleton;
    }

}
