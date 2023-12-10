package org.nikitinia.patterns.behavior.mediator;

import org.nikitinia.domain.model.documents.Document;

public class Admin extends User {

    CommunicationSystem communicationSystem;

    public Admin(CommunicationSystem communicationSystem, String name) {
        super(communicationSystem, name);
    }

    @Override
    public void visualizeDocument(Document document) {
        System.out.println("Admin visualize " + document);
    }
}
