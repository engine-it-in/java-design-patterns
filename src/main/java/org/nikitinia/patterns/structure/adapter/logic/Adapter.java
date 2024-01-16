package org.nikitinia.patterns.structure.adapter.logic;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;
import org.nikitinia.patterns.structure.adapter.actor.DocumentRepository;

/*
 * Что -> Класс адаптер, наследующий логику конкретной работы и
 переопрделяющий требуемый для нас интерфейс;
 * Для чего -> Класс, наследует компоненты, логику которых надо адаптировать;
 * Реализация -> Класс, наследующий класс с конкретными действиями и имплементирующий рабочую сигнатуру;
 * В чем выгода -> Рабочая логика, реализуемая через этот класс позволит просто менять
 конкретную логику работы над документами и адаптировать ее под требуемые условия;
 * */
@Slf4j
@AllArgsConstructor
public class Adapter extends DocumentRepository implements DocumentDatabase {


    @Override
    public void insert(Document document) {
        save(document);
    }

    @Override
    public Document select(Double number) {
        return load(number);
    }

    @Override
    public void update(Document document) {
        Document updateDocument = select(document.getNumber());
        updateDocument.setStatus(Status.SIGN);
        remove(document);
        insert(updateDocument);
    }

    @Override
    public void remove(Document document) {
        delete(document);
    }

    @Override
    public void stateDocumentMap() {
        if (!getDocumentMap().isEmpty()) {
            getDocumentMap()
                    .forEach((aDouble, document) -> log.info("documentMap contain document with number: {}", aDouble));
        } else {
            log.info("DocumentMap is Empty");
        }

    }
}
