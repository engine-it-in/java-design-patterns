package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.nikitinia.domain.model.documents.Bill;
import org.nikitinia.domain.model.documents.Document;

public class BillCreator extends DocumentCreator {

    public BillCreator(Bill bill) {
        super(bill);
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " bill");
    }
}
