package org.nikitinia.patterns.behavior.TemplateMethod.logic.creators;

import org.nikitinia.domain.Bill;
import org.nikitinia.domain.Document;

public class BillCreator extends DocumentCreator {

    public BillCreator(Bill bill) {
        super(bill);
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " bill");
    }
}
