package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;
import java.util.Map;

public class AgreementTemplate extends DocumentTemplate {

    public AgreementTemplate(Agreement agreement, Map<Double, Document> documentDictionary) {
        super(agreement, documentDictionary);
    }

    @Override
    public Map<Double, Document> addLink(Document document) {
        HashMap<Double, Document> documentDictionary = new HashMap<>();
        documentDictionary.put(document.getNumber(), document);
        return documentDictionary;
    }

    @Override
    public void modifyDocument(Document document) {
        document.setSignatory("Agreement");
    }
}
