package org.nikitinia.patterns.structure.bridge.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

/*
 * Что -> ;
 * Для чего -> ;
 * Реализация -> ;
 * В чем выгода -> ;
 * */
@Slf4j
public class WebDocument extends DocumentAbstract {
    public WebDocument(Interfaze anInterfaze) {
        super(anInterfaze);
    }

    @Override
    public void createDocument(org.nikitinia.domain.model.documents.Document document) {
        log.info("create web document");

        org.nikitinia.domain.model.documents.Document loadedDocument =
                interfaze.loadDocument(document.getNumber());

        interfaze.visualizeDocument(loadedDocument.getNumber());
    }
}
