package org.nikitinia.patterns.creating.factorymethod.action;

import org.nikitinia.patterns.creating.factorymethod.actor.Document;
import org.nikitinia.patterns.creating.factorymethod.actor.OfficialDocument;

/**
 * Что -> Класс, реализующий фабричный интерфейс;
 * Для чего -> Инкапсуляция оповещения в конкретном классе с общим интерфейсом;
 * Реализация -> Класс с фабричным интерфейсом;
 * Ценность -> Мы инкапсулируем работу с оповещением и работаем с ним через "производителя".
 * Так мы оставляем клиентский код максимально не изменяемым;
 */
public class OfficialDocumentCreator implements DocumentCreator {

    @Override
    public Document createDocument() {
        return new OfficialDocument();
    }
}
