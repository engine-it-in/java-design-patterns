package org.nikitinia.patterns.behavior.observer.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SubscriberTest {

    Subscriber subscriber = new Subscriber("name");

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkSubscriber() {
        assertThat(subscriber)
                .hasFieldOrPropertyWithValue("name", "name");
    }

    @Test
    void eventListener_shouldReturnResult() {
        Document document = DocumentCreator.documentBuildWithNumber(1.0);
        String action = "action";

        subscriber.eventListener(List.of(document), action);

        assertThat(outputStream.toString().trim())
                .isEqualTo("name" + " " + List.of(document) + " " + action);
    }

}