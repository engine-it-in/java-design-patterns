package org.nikitinia.patterns.structure.bridge.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

@Slf4j
public class MobileDocument extends Document {
    public MobileDocument(Interfaze interfaze) {
        super(interfaze);
    }

    @Override
    public void createDocument(org.nikitinia.domain.model.documents.Document document) {
        log.info("create mobile document");

        org.nikitinia.domain.model.documents.Document loadedDocument =
                interfaze.loadDocument(document.getNumber());

        interfaze.visualizeDocument(loadedDocument.getNumber());
    }
}
