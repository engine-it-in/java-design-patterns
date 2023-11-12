package org.patterns.behavior.TemplateMethod.logic.creators;

import org.patterns.behavior.TemplateMethod.domain.Bill;
import org.patterns.behavior.TemplateMethod.domain.Document;
import org.patterns.behavior.TemplateMethod.logic.DocumentCreator;

public class BillCreator extends DocumentCreator {

    public BillCreator() {
        super(new Bill());
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " bill");
    }
}
