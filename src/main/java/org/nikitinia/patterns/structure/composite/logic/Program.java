package org.nikitinia.patterns.structure.composite.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.composite.actor.ContainerDocument;
import org.nikitinia.patterns.structure.composite.action.Processor;
import org.nikitinia.patterns.structure.composite.actor.ConstructionDocument;
import org.nikitinia.patterns.structure.composite.actor.ArchitecturalDocument;

public class Program {

    public static void main(String[] args) {
        ContainerDocument containerDocument = new ContainerDocument();

        Document document = DocumentCreator.documentBuildWithNumber(1.0);

        Processor documentForConstruction = new ConstructionDocument(document);
        Processor documentForArchitectural = new ArchitecturalDocument(document);

        containerDocument.addDocument(documentForConstruction);
        containerDocument.addDocument(documentForArchitectural);

        documentForConstruction.processing();
        documentForArchitectural.processing();
        containerDocument.processing();
        containerDocument.notifying();

    }

}
