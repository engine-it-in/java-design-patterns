package org.nikitinia.patterns.behavior.templatemethod.actor;

import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;
import java.util.Map;

/*
 * Что -> Реализация конкретных шагов шаблонного метода;
 * Для чего -> Реализация конкретного поведения;
 * Реализация -> Класс, неследованный от общего шаблонного абстрактного класса ;
 * В чем выгода -> Реализация логики в оамках общего алгоритма, определенного абстрактным классом;
 * */
public class AgreementTemplate extends DocumentTemplate {
    public AgreementTemplate(Agreement agreement) {
        super(agreement);
    }

    @Override
    public Map<Double, Document> addLink(Document document) {
        HashMap<Double, Document> documentDictionary = new HashMap<>();
        documentDictionary.put(document.getNumber(), document);
        return documentDictionary;
    }

    @Override
    public void modifyDocument(Document document) {
        document.setSignatory(document.getClass().getSimpleName());
    }
}
