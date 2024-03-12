package org.nikitinia.patterns.creating.factorymethod.action;

import org.nikitinia.patterns.creating.factorymethod.actor.MediaDocument;
import org.nikitinia.patterns.creating.factorymethod.actor.Document;

public class MediaDocumentCreator implements DocumentCreator {
    @Override
    public Document createDocument() {
        return new MediaDocument();
    }

}
