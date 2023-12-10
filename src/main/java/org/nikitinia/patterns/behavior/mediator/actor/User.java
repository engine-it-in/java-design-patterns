package org.nikitinia.patterns.behavior.mediator.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.logic.DocumentSystem;

public abstract class User {

    DocumentSystem documentSystem;

    @Getter
    String name;

    @Getter
    @Setter
    boolean isEnabled = true;

    public User(DocumentSystem documentSystem, String name) {
        this.documentSystem = documentSystem;
        this.name = name;
    }

    public void sendDocument(Document document) {
        documentSystem.senDocument(document, this);
    }

    public abstract void visualizeDocument(Document document);

}
