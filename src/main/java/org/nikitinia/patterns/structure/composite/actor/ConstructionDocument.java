package org.nikitinia.patterns.structure.composite.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.composite.action.Processor;

/**
 * Что -> Конкретный класс, наследник общего абстрактного класса;
 * Для чего -> Выполнение конкретных действий;
 * Реализация -> Конкретный класс, наследник абстрактного класса и реализатор поведения общего интерфейса;
 * Ценность -> Исполнение логики програмы;
 */
@Slf4j
public class ConstructionDocument extends MainDocument implements Processor {
    public ConstructionDocument(Document document) {
        super(document);
    }

    @Override
    public void processing() {
        log.info("Some text add to construction document {}", getDocument().getNumber());
    }

    @Override
    public void notifying() {
        log.info("Construction document {} end processing", getDocument().getNumber());
    }
}
