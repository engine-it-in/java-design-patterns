package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

public class DocumentEditor {

    @Setter
    private Document document;

    public Memento memento() {
        return new Memento(document);
    }

    public void load(Memento memento) {
        memento.getDocument();
    }
}
