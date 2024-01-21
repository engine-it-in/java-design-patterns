package org.nikitinia.patterns.structure.bridge.action;

import org.nikitinia.domain.model.documents.Document;

public interface Interfaze {

    Document loadDocument(Double id);

    void visualizeDocument(Double id);

}
