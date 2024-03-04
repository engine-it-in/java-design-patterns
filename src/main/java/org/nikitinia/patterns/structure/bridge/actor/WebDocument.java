package org.nikitinia.patterns.structure.bridge.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

/*
 * Что -> Реализация работы с мобильным документом;
 * Для чего -> Реализация конкретных действий;
 * Реализация -> Конкретный класс;
 * В чем выгода -> Реализация логики;
 * */
@Slf4j
public class WebDocument extends DocumentAbstract {
    public WebDocument(Interfaze interfaze) {
        super(interfaze);
    }

    @Override
    public void createDocument(Document document) {
        log.info("create web document");

        Document loadedDocument = interfaze.loadDocument(document.getNumber());

        interfaze.visualizeDocument(loadedDocument.getNumber());
    }
}
