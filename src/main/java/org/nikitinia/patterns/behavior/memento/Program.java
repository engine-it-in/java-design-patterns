package org.nikitinia.patterns.behavior.memento;

public class Program {

    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();
        Repository repository = new Repository();
        documentEditor.setText("Text");
        repository.setMemento(documentEditor.memento());
        documentEditor.setText("new text");
        documentEditor.load(repository.getMemento());

    }

}
