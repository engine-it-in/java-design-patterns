package org.nikitinia.patterns.creating.factorymethod.action;

import org.nikitinia.patterns.creating.factorymethod.actor.Document;
import org.nikitinia.patterns.creating.factorymethod.actor.OfficialDocument;

/**
 * Что -> Класс, реализующий фабричный интерфейс;
 * Для чего -> Инкапсуляция оповещения в конкретном классе с общим интерфейсом;
 * Реализация -> Класс с фабричным интерфейсом;
 * Ценность -> Инкапсуляция работы по оповещению и работа с ним через "производителя";
 */
public class OfficialDocumentCreator implements DocumentCreator {

    @Override
    public Document createDocument() {
        return new OfficialDocument();
    }
}
