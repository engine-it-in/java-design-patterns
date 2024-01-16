package org.nikitinia.patterns.structure.adapter.actor;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;

/*
 * Что -> Временный класс, который является временной альтернативой базе документов;
 * Для чего -> Класс реализующий конкретную рабочую логику;
 * Реализация -> Класс;
 * В чем выгода -> Реализация конкретных действий над документами;
 * */
@Getter
@Slf4j
public class DocumentRepository {

    HashMap<Double, Document> documentMap =
            new HashMap<>();

    public void save(Document document) {
        log.info("Save");
        documentMap.put(document.getNumber(), document);
    }

    public Document load(Double number) {
        log.info("Load");
        return documentMap.get(number);
    }

    public void delete(Document document) {
        log.info("Delete");
        documentMap.remove(document.getNumber());
    }


}