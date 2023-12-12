package org.nikitinia.patterns.behavior.mediator.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.logic.AudioDocumentSystem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.nikitinia.patterns.behavior.mediator.util.Constant.TEST_NAME;

class AdminTest {

    private final AudioDocumentSystem audioDocumentSystem =
            new AudioDocumentSystem();

    private final Admin admin =
            new Admin(audioDocumentSystem, TEST_NAME);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    private final Document document =
            DocumentCreator.documentBuild();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkAdmin() {
        assertThat(admin)
                .hasFieldOrPropertyWithValue("documentSystem", audioDocumentSystem)
                .hasFieldOrPropertyWithValue("name", TEST_NAME);
    }

    @Test
    void visualizeDocument_shouldDo() {
        admin.visualizeDocument(document);

        assertEquals(
                "Admin visualize " + document,
                outputStream.toString().trim()
        );

    }

}