package org.nikitinia.patterns.behavior.chainofresponsobility.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.TypeSystem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class SmsActivityTest {

    SmsActivity smsActivity
            = new SmsActivity(Priority.CRITICAL);

    private final ByteArrayOutputStream byteArrayOutputStream =
            new ByteArrayOutputStream();

    Document document = DocumentCreator.documentBuildWithNumber(1.0);

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    void smsActivityCheck() {
        assertThat(smsActivity)
                .hasFieldOrPropertyWithValue("priority", smsActivity.getPriority())
                .isInstanceOf(Activity.class);
    }

    @Test
    void writeDocument_shouldReturnResult() {
        smsActivity.writeDocument(document);

        assertThat(byteArrayOutputStream.toString().trim())
                .isEqualTo(TypeSystem.SMS.getSystem() + " : " + document);
    }

}