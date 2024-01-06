package org.nikitinia.patterns.behavior.chainofresponsobility.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.TypeSystem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class TelegramActivityTest {

    TelegramActivity telegramActivity
            = new TelegramActivity(Priority.CRITICAL);

    private final ByteArrayOutputStream byteArrayOutputStream =
            new ByteArrayOutputStream();

    Document document = DocumentCreator.documentBuildWithNumber(1.0);

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    void telegramActivityCheck() {
        assertThat(telegramActivity)
                .hasFieldOrPropertyWithValue("priority", telegramActivity.getPriority())
                .isInstanceOf(Activity.class);
    }

    @Test
    void writeDocument_shouldReturnResult() {
        telegramActivity.writeDocument(document);

        assertThat(byteArrayOutputStream.toString().trim())
                .isEqualTo(TypeSystem.TELEGRAM.getSystem() + " : " + document);
    }

}