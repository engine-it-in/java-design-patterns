package org.nikitinia.patterns.structure.bridge.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;

/**
 * Что -> Класс, реализующий работу с документами через репозиторий;
 * Для чего -> Реализация конкретной логики;
 * Реализация -> Класс с методами;
 * Ценность -> Реализация бизнес логики;
 */
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
