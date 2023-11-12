package org.patterns.behavior.TemplateMethod.logic.creators;

import org.patterns.behavior.TemplateMethod.domain.Document;
import org.patterns.behavior.TemplateMethod.domain.Invoice;
import org.patterns.behavior.TemplateMethod.logic.DocumentCreator;

public class InvoiceCreator extends DocumentCreator {


    public InvoiceCreator() {
        super(new Invoice());
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " invoice");
    }
}
