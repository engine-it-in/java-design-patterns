package org.nikitinia.patterns.creating.factorymethod.action;

import org.nikitinia.patterns.creating.factorymethod.actor.MediaDocument;
import org.nikitinia.patterns.creating.factorymethod.actor.Document;

/**
 * Что -> Класс, реализующий фабричный интерфейс;
 * Для чего -> Инкапсуляция оповещения в конкретном классе с общим интерфейсом;
 * Реализация -> Класс с фабричным интерфейсом;
 * В чем выгода -> Мы инкапсулируем работу с оповещением и работаем с ним через "производителя".
 * Так мы оставляем клиентский код максимально не изменяемым;
 */
public class MediaDocumentCreator implements DocumentCreator {
    @Override
    public Document createDocument() {
        return new MediaDocument();
    }

}
