package org.nikitinia.patterns.structure.composite.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.composite.action.Processor;

/**
 * Что -> Конкретный класс, наследник общего абстрактного класса;
 * Для чего -> Выполнение конкретных действий;
 * Реализация -> Класс наследует общий компонент и реализует требуемое поведения;
 * Ценность -> Исполнение логики программы;
 */
@Slf4j
public class ArchitecturalDocument extends MainDocument implements Processor {

    public ArchitecturalDocument(Document document) {
        super(document);
    }

    @Override
    public void processing() {
        log.info("Some text add to architectural document {}", getDocument().getNumber());
    }

    @Override
    public void notifying() {
        log.info("Architectural document {} end processing", getDocument().getNumber());
    }
}
