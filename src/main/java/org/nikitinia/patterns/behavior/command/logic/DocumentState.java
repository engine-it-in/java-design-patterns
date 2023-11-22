package org.nikitinia.patterns.behavior.command.logic;

import org.nikitinia.domain.model.documents.Document;

import java.util.List;

public class DocumentState {

    List<Document> documentsList;

    public void on() {

        System.out.println("Document on");
    }

    public void off() {
        System.out.println("Document off");
    }

}
