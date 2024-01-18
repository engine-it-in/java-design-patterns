package org.nikitinia.patterns.structure.composite.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class ConstructionDocumentTest {

    Document document =
            DocumentCreator.documentBuildWithNumber(1.0);

    ConstructionDocument constructionDocument =
            new ConstructionDocument(document);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkConstructionDocument() {

        assertThat(constructionDocument)
                .isInstanceOf(ConstructionDocument.class)
                .isInstanceOf(MainDocument.class)
                .hasFieldOrPropertyWithValue("document", document);

        assertThat(constructionDocument.getDocument())
                .usingRecursiveComparison()
                .isEqualTo(document);
    }

    @Test
    void processing_shouldDo() {
        constructionDocument.processing();

        assertThat(outputStream.toString().trim())
                .contains("Some text add to construction document")
                .contains(String.valueOf(document.getNumber()));

    }

    @Test
    void notifying_shouldDo() {
        constructionDocument.notifying();

        assertThat(outputStream.toString().trim())
                .contains("Construction document")
                .contains("end processing")
                .contains(String.valueOf(document.getNumber()));
    }

}