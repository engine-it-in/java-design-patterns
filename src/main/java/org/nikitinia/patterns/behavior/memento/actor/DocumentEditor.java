package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Setter;
import org.nikitinia.patterns.behavior.memento.actor.Memento;

public class DocumentEditor {

    @Setter
    private String text;

    @Override
    public String toString() {
        return "DocumentEditor{" +
                "text='" + text + '\'' +
                '}';
    }

    public Memento memento() {
        return new Memento(text);
    }

    public void load(Memento memento) {
        memento.getText();
    }
}
