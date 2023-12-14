package org.nikitinia.patterns.behavior.memento.run;

import org.nikitinia.patterns.behavior.memento.actor.DocumentEditor;
import org.nikitinia.patterns.behavior.memento.actor.Repository;

public class Program {

    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();
        Repository repository = new Repository();
        documentEditor.setDocument("Text");
        repository.setMemento(documentEditor.memento());
        documentEditor.setDocument("new text");
        documentEditor.load(repository.getMemento());

    }

}
