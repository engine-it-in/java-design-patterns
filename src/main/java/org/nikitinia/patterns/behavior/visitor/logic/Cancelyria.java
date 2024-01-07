package org.nikitinia.patterns.behavior.visitor.logic;

import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

public class Cancelyria implements Visitor {
    @Override
    public void visit(FinanceDocument financeDocument) {
        System.out.println("Some thing finance");
    }

    @Override
    public void visit(ManagementDocument managementDocument) {
        System.out.println("Some thing management");
    }
}
