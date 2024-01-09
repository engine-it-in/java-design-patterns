package org.nikitinia.patterns.behavior.mediator.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.action.AudioDocumentSystem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.nikitinia.patterns.behavior.mediator.util.Constant.TEST_NAME;

class OperatorTest {

    private final AudioDocumentSystem audioDocumentSystem
            = new AudioDocumentSystem();

    private final Operator operator
            = new Operator(audioDocumentSystem, TEST_NAME);

    private final Document document
            = DocumentCreator.documentBuild();

    private ByteArrayOutputStream outputStream
            = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkOperator() {
        assertThat(operator)
                .hasFieldOrPropertyWithValue("documentSystem", audioDocumentSystem)
                .hasFieldOrPropertyWithValue("name", TEST_NAME);
    }

    @Test
    void visualizeDocument_shouldDoResult() {
        operator.visualizeDocument(document);

        assertEquals(
                "Operator visualize " + document,
                outputStream.toString().trim()
        );
    }


}