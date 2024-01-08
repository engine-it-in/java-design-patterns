package org.nikitinia.patterns.behavior.visitor.logic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

import java.util.HashMap;

@NoArgsConstructor
@Getter
public class Register implements Visitor {

    private final HashMap<String, Document> registerMap
            = new HashMap<>();


    @Override
    public void visit(FinanceDocument financeDocument) {
        registerMap.put(financeDocument.getId(), financeDocument.getDocument());
    }

    @Override
    public void visit(ManagementDocument managementDocument) {
        registerMap.put(managementDocument.getId(), managementDocument.getDocument());
    }

    @Override
    public void visit(PayDocument payDocument) {
        registerMap.put(payDocument.getId(), payDocument.getDocument());
    }

}
