package org.nikitinia.patterns.behavior.visitor.logic;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Converter implements Visitor {

    private final List<Document> converterList
            = new ArrayList<>();

    @Override
    public void visit(FinanceDocument financeDocument) {
        System.out.println("FinanceDocument" + " : " + financeDocument.getId() + " convert to regular document");
        converterList.add(financeDocument.getDocument());
    }

    @Override
    public void visit(ManagementDocument managementDocument) {
        System.out.println("ManagementDocument" + " : " + managementDocument.getId() + " convert to regular document");
        converterList.add(managementDocument.getDocument());
    }

    @Override
    public void visit(PayDocument payDocument) {
        System.out.println("PayDocument" + " : " + payDocument.getId() + " convert to regular document");
        converterList.add(payDocument.getDocument());
    }
}
