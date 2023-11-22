package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Document;

public class AgreementCreator extends DocumentCreator {

    public AgreementCreator(Agreement agreement) {
        super(agreement);
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " agreement");
    }
}
