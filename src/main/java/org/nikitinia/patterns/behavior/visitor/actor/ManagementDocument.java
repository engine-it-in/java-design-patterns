package org.nikitinia.patterns.behavior.visitor.actor;

import org.nikitinia.patterns.behavior.visitor.visitor.DocumentVisitor;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

public class ManagementDocument implements DocumentVisitor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
