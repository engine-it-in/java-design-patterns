package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.domain.model.documents.Invoice;

import java.util.HashMap;
import java.util.Map;

public class InvoiceTemplate extends DocumentTemplate {


    public InvoiceTemplate(Invoice invoice, Map<Double, Document> documentDictionary) {
        super(invoice, documentDictionary);
    }

    @Override
    public Map<Double, Document> addLink(Document document) {
        HashMap<Double, Document> documentDictionary = new HashMap<>();
        documentDictionary.put(document.getNumber() * 10, document);
        return documentDictionary;
    }

    @Override
    public void modifyDocument(Document document) {
        document.setSignatory("Invoice");
    }

}
