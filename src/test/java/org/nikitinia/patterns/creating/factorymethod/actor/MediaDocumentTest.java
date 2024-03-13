package org.nikitinia.patterns.creating.factorymethod.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class MediaDocumentTest {

    private final MediaDocument mediaDocument =
            new MediaDocument();

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkMediaDocument() {
        assertThat(mediaDocument)
                .hasNoNullFieldsOrProperties()
                .isInstanceOf(Document.class);
    }

    @Test
    void notifyUser_shouldReturnResult() {
        mediaDocument.notifyUser();

        assertThat(outputStream.toString().trim())
                .contains("Notify, what  media document send...");

    }

}