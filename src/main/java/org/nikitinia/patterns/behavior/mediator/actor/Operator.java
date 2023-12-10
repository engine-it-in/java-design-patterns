package org.nikitinia.patterns.behavior.mediator.actor;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.logic.DocumentSystem;

public class Operator extends User {

    public Operator(DocumentSystem documentSystem, String name) {
        super(documentSystem, name);
    }

    @Override
    public void visualizeDocument(Document document) {
        System.out.println("Operator visualize " + document);
    }
}
