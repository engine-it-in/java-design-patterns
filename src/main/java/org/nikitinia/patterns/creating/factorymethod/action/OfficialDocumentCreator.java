package org.nikitinia.patterns.creating.factorymethod.action;

import org.nikitinia.patterns.creating.factorymethod.actor.Document;
import org.nikitinia.patterns.creating.factorymethod.actor.OfficialDocument;

public class OfficialDocumentCreator implements DocumentCreator {

    @Override
    public Document createDocument() {
        return new OfficialDocument();
    }
}
