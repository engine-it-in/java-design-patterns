package org.nikitinia.patterns.behavior.visitor.visitor;


import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;

public interface Visitor {

    void visit(FinanceDocument financeDocument);

    void visit(ManagementDocument managementDocument);

    void visit(PayDocument payDocument);

}
