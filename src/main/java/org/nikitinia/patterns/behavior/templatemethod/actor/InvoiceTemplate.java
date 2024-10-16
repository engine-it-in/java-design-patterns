package org.nikitinia.patterns.behavior.templatemethod.actor;

import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.domain.model.documents.Invoice;

import java.util.HashMap;
import java.util.Map;

/**
 * Что -> Реализация конкретных шагов шаблонного метода;
 * Для чего -> Реализация конкретного поведения;
 * Реализация -> Класс, наследованный от общего шаблонного абстрактного класса;
 * Ценность -> Реализация логики в рамках общего алгоритма, определенного абстрактным классом;
 */
public class InvoiceTemplate extends DocumentTemplate {
    public InvoiceTemplate(Invoice invoice) {
        super(invoice);
    }

    @Override
    public Map<Double, Document> addLink(Document document) {
        HashMap<Double, Document> documentDictionary = new HashMap<>();
        documentDictionary.put(document.getNumber() * 10, document);
        return documentDictionary;
    }

    @Override
    public void modifyDocument(Document document) {
        document.setSignatory(document.getClass().getSimpleName());
        document.setStatus(Status.PRESIGN);
    }

}
