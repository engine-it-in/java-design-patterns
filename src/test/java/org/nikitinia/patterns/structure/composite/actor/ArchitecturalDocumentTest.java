package org.nikitinia.patterns.structure.composite.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class ArchitecturalDocumentTest {

    Document document =
            DocumentCreator.documentBuildWithNumber(1.0);

    ArchitecturalDocument architecturalDocument =
            new ArchitecturalDocument(document);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkArchitecturalDocument() {

        assertThat(architecturalDocument)
                .isInstanceOf(ArchitecturalDocument.class)
                .isInstanceOf(MainDocument.class)
                .hasFieldOrPropertyWithValue("document", document);

        assertThat(architecturalDocument.getDocument())
                .usingRecursiveComparison()
                .isEqualTo(document);
    }

    @Test
    void processing_shouldDo() {
        architecturalDocument.processing();

        assertThat(outputStream.toString().trim())
                .contains("Some text add to architectural document")
                .contains(String.valueOf(document.getNumber()));

    }

    @Test
    void notifying_shouldDo() {
        architecturalDocument.notifying();

        assertThat(outputStream.toString().trim())
                .contains("Architectural document")
                .contains("end processing")
                .contains(String.valueOf(document.getNumber()));
    }

}