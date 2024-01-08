package org.nikitinia.patterns.behavior.visitor.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.behavior.visitor.visitor.Acceptor;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nikitinia.patterns.behavior.visitor.util.TestBuilder.*;
import static org.nikitinia.patterns.behavior.visitor.util.TestData.TEST_ID;

class PayDocumentTest {

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkPayDocument() {
        assertThat(testPayDocument)
                .hasFieldOrPropertyWithValue("id", TEST_ID)
                .hasFieldOrPropertyWithValue("document", testDocument)
                .isInstanceOf(Acceptor.class);
    }

    @Test
    void accept_shouldDo() {
        testPayDocument.accept(testConverter);

        assertThat(outputStream.toString().trim())
                .isEqualTo("PayDocument : id convert to regular document");

        assertThat(testConverter.getConverterList())
                .contains(testPayDocument.getDocument());
    }

}