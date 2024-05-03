package org.nikitinia.patterns.behavior.memento.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.memento.actor.DocumentEditor;
import org.nikitinia.patterns.behavior.memento.actor.Repository;

public class Program {

    public static void main(String[] args) {

        DocumentEditor documentEditor = new DocumentEditor();
        Repository repository = new Repository();

        Document documentFirst = DocumentCreator.documentBuildWithNumber(1.0);
        Document documentSecond = DocumentCreator.documentBuildWithNumber(2.0);

        documentEditor.setDocument(documentFirst);
        repository.setMemento(documentEditor.memento());

        documentEditor.setDocument(documentSecond);

        documentEditor.load(repository.getMemento());

    }

}
