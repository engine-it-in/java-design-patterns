package org.nikitinia.patterns.behavior.mediator;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

public abstract class User {

    CommunicationSystem communicationSystem;

    @Getter
    String name;

    @Getter
    @Setter
    boolean isEnabled = true;

    public User(CommunicationSystem communicationSystem, String name) {
        this.communicationSystem = communicationSystem;
        this.name = name;
    }

    public void sendDocument(Document document) {
        communicationSystem.senDocument(document, this);
    }

    abstract void visualizeDocument(Document document);

}
