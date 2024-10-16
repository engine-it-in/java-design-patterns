package org.nikitinia.patterns.structure.composite.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.composite.action.Processor;

import java.util.ArrayList;
import java.util.List;

/**
 * Что -> Конкретный класс, наследник общего абстрактного класса;
 * Для чего -> Выполнение конкретных действий;
 * Реализация -> Класс наследует общий компонент и реализует требуемое поведения;
 * Ценность -> Исполнение логики программы;
 */
@Slf4j
public class ContainerDocument implements Processor {

    List<Processor> documentList = new ArrayList<>();

    public void addDocument(Processor processor) {
        documentList.add(processor);
    }

    void removeDocument(Processor processor) {
        documentList.remove(processor);
    }

    @Override
    public void processing() {
        log.info("Start");
        documentList.forEach(Processor::notifying);
    }

    @Override
    public void notifying() {
        log.info("End");
    }

}
