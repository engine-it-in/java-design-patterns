package org.nikitinia.patterns.behavior.mediator;

import org.nikitinia.domain.model.documents.Document;

public class Operator extends User {

    public Operator(CommunicationSystem communicationSystem, String name) {
        super(communicationSystem, name);
    }

    @Override
    public void visualizeDocument(Document document) {
        System.out.println("Operator visualize " + document);
    }
}
