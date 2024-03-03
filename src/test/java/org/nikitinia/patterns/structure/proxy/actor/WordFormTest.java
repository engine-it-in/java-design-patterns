package org.nikitinia.patterns.structure.proxy.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.structure.proxy.action.PrintForm;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class WordFormTest {

    private final WordForm wordForm
            = new WordForm(1.0);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void wordForm_shouldReturnResult() {
        assertThat(wordForm)
                .isInstanceOf(PrintForm.class)
                .hasFieldOrPropertyWithValue("documentNumber", 1.0);
    }

    @Test
    void display_shouldReturnResult() {
        wordForm.display();

        assertThat(outputStream.toString().trim())
                .contains("Display document with number")
                .contains(wordForm.getDocumentNumber().toString());
    }

}