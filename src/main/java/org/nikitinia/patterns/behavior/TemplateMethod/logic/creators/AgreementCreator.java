package org.nikitinia.patterns.behavior.TemplateMethod.logic.creators;

import org.nikitinia.domain.objects.Agreement;
import org.nikitinia.domain.objects.Document;

public class AgreementCreator extends DocumentCreator {

    public AgreementCreator(Agreement agreement) {
        super(agreement);
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " agreement");
    }
}
