package org.patterns.behavior.TemplateMethod.logic.creators;

import org.patterns.behavior.TemplateMethod.domain.Agreement;
import org.patterns.behavior.TemplateMethod.domain.Document;
import org.patterns.behavior.TemplateMethod.logic.DocumentCreator;

public class AgreementCreator extends DocumentCreator {

    public AgreementCreator() {
        super(new Agreement());
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " agreement");
    }
}
