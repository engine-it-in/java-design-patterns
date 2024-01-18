package org.nikitinia.patterns.structure.composite.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.composite.action.Processor;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ContainerDocumentTest {

    ContainerDocument containerDocument =
            new ContainerDocument();

    Document document =
            DocumentCreator.documentBuildWithNumber(1.0);

    Processor processor =
            new ArchitecturalDocument(document);

    private ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkContainerDocument() {
        assertThat(containerDocument)
                .hasFieldOrPropertyWithValue("documentList", new ArrayList<>());
    }

    @Test
    void addDocument_shouldDo() {

        containerDocument.addDocument(processor);

        assertThat(containerDocument.documentList)
                .contains(processor);
    }

    @Test
    void removeDocument_shouldDo() {

        containerDocument.addDocument(processor);
        containerDocument.removeDocument(processor);

        assertThat(containerDocument.documentList)
                .isEmpty();
    }

    @Test
    void processing_shouldDo() {

        containerDocument.addDocument(processor);

        containerDocument.processing();

        assertThat(outputStream.toString())
                .contains("Start")
                .contains("Architectural document")
                .contains(String.valueOf(document.getNumber()))
                .contains("end processing");
    }

    @Test
    void notifying_shouldDo() {

        containerDocument.notifying();

        assertThat(outputStream.toString().trim())
                .contains("End");
    }



}