package org.nikitinia.patterns.creating.factorymethod.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class OfficialDocumentTest {

    private final OfficialDocument officialDocument =
            new OfficialDocument();

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkOfficialDocument() {
        assertThat(officialDocument)
                .hasNoNullFieldsOrProperties()
                .isInstanceOf(Document.class);
    }

    @Test
    void notifyUser_shouldReturnResult() {
        officialDocument.notifyUser();

        assertThat(outputStream.toString().trim())
                .contains("Notify, what document send...");
    }

}