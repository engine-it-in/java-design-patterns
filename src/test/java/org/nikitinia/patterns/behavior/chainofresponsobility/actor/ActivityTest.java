package org.nikitinia.patterns.behavior.chainofresponsobility.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.action.PublicDocument;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.Priority;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.TypeSystem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class ActivityTest {

    Activity activity = Mockito.mock(
            Activity.class,
            Mockito.CALLS_REAL_METHODS
    );

    SmsActivity smsActivity = new SmsActivity(Priority.CRITICAL);
    TelegramActivity telegramActivity = new TelegramActivity(Priority.CRITICAL);

    Document document = DocumentCreator.documentBuildWithNumber(1.0);

    private final ByteArrayOutputStream byteArrayOutputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    void checkActivity() {
        assertThat(activity)
                .hasFieldOrPropertyWithValue("priority", null)
                .hasFieldOrPropertyWithValue("next", null)
                .isInstanceOf(Activity.class)
                .isInstanceOf(PublicDocument.class);
    }

    @Test
    void checkActivityPriority() {
        assertThat(smsActivity)
                .hasFieldOrPropertyWithValue("priority", Priority.CRITICAL)
                .isInstanceOf(Activity.class)
                .isInstanceOf(PublicDocument.class);
    }

    @Test
    void publicity_shouldReturnResult() {
        smsActivity.publicity(document, telegramActivity);

        assertThat(byteArrayOutputStream.toString().trim())
                .isEqualTo(TypeSystem.SMS.getSystem() + " : " + document);
    }

    @Test
    void publicity_shouldReturnNonNullResult() {

        SmsActivity smsActivity = new SmsActivity(Priority.VIP);
        TelegramActivity telegramActivity = new TelegramActivity(Priority.CRITICAL);

        smsActivity.setNext(telegramActivity);
        smsActivity.publicity(document, telegramActivity);

        assertThat(byteArrayOutputStream.toString().trim())
                .contains(TypeSystem.TELEGRAM.getSystem() + " : " + document)
                .contains(TypeSystem.SMS.getSystem() + " : " + document);
    }


}