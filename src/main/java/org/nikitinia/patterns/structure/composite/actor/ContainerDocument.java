package org.nikitinia.patterns.structure.composite.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.composite.action.Processor;

import java.util.ArrayList;
import java.util.List;

/*
 * Что -> Конкретный класс, 2 уровня иерархии;
 * Для чего -> Реализует работу с объектами первого уровня, при этом сам переопределяет методы общего нтерфейса;
 * Реализация -> Класс с реализацией методов интерфейса и структурой для хранения объектов первого уровня, их добавлением и удалением;
 * В чем выгода -> Объект 2 уровня иерархии;
 * */
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
