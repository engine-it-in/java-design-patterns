package org.nikitinia.patterns.structure.bridge.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;

@Getter
public class DocumentRepository {

    private final HashMap<Double, Document> documentMap = new HashMap<>();

    public final void putDocument(Document document) {
        documentMap.put(document.getNumber(), document);
    }

    public final Document getDocument(Double id) {
        return documentMap.get(id);
    }

}
