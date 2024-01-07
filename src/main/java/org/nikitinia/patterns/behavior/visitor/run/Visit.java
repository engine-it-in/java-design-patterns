package org.nikitinia.patterns.behavior.visitor.run;

import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.logic.BackOffice;
import org.nikitinia.patterns.behavior.visitor.logic.Cancelyria;
import org.nikitinia.patterns.behavior.visitor.visitor.DocumentVisitor;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

public class Visit {

    public static void main(String[] args) {

        DocumentVisitor financeDocument = new FinanceDocument();
        DocumentVisitor managementDocument = new ManagementDocument();

        Visitor cancelyria = new Cancelyria();
        Visitor backOffice = new BackOffice();

        financeDocument.accept(cancelyria);
        managementDocument.accept(cancelyria);

        financeDocument.accept(backOffice);
        managementDocument.accept(backOffice);

    }

}


