package org.nikitinia.patterns.structure.proxy.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.proxy.action.PrintForm;


/**
 * Что -> Класс прокси;
 * Для чего -> Имплементация интерфейса, агрегирование основного класса в виде атрибута и реализация метода по рабочей логике;
 * Реализация -> Класс с имплементацией интерфейса;
 * Ценность -> Реализация логики;
 */
@Slf4j
public class ProxyDocument implements PrintForm {

    private final Double documentNumber;

    private WordForm documentForm;

    public ProxyDocument(Double documentNumber) {
        this.documentNumber = documentNumber;
    }

    private void logDocumentForm(WordForm wordForm) {
        log.info("Work with object {}", wordForm.toString());
    }

    @Override
    public void display() {
        if (documentForm == null) {
            documentForm = new WordForm(documentNumber);
        }
        logDocumentForm(documentForm);
        documentForm.display();
    }
}
