package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.domain.model.documents.Invoice;

public class InvoiceCreator extends DocumentCreator {


    public InvoiceCreator(Invoice invoice) {
        super(invoice);
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " invoice");
    }
}
