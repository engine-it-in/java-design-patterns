package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Bill;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;
import java.util.Map;

public class BillTemplate extends DocumentTemplate {
    public BillTemplate(Bill bill) {
        super(bill);
    }

    @Override
    public Map<Double, Document> addLink(Document document) {
        HashMap<Double, Document> documentDictionary = new HashMap<>();
        documentDictionary.put(document.getNumber() + 10, document);
        return documentDictionary;
    }

    @Override
    public void modifyDocument(Document document) {
        document.setSignatory(document.getClass().getSimpleName());
        document.setStatus(Status.SIGN);
    }

}
