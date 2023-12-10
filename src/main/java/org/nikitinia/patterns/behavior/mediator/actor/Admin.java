package org.nikitinia.patterns.behavior.mediator.actor;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.logic.DocumentSystem;

public class Admin extends User {

    DocumentSystem documentSystem;

    public Admin(DocumentSystem documentSystem, String name) {
        super(documentSystem, name);
    }

    @Override
    public void visualizeDocument(Document document) {
        System.out.println("Admin visualize " + document);
    }
}
