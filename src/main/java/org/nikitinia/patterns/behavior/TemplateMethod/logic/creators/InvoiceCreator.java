package org.nikitinia.patterns.behavior.TemplateMethod.logic.creators;

import org.nikitinia.domain.Document;
import org.nikitinia.domain.Invoice;

public class InvoiceCreator extends DocumentCreator {


    public InvoiceCreator(Invoice invoice) {
        super(invoice);
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " invoice");
    }
}
