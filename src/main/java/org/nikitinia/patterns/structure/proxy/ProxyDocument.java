package org.nikitinia.patterns.structure.proxy;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ProxyDocument implements PrintForm {

    private Double documentNumber;

    public ProxyDocument(Double documentNumber) {
        this.documentNumber = documentNumber;
    }

    private WordForm documentForm;

    @Override
    public void display() {
        if (documentForm == null) {
            documentForm = new WordForm(documentNumber);
        }
        documentForm.display();
    }
}
