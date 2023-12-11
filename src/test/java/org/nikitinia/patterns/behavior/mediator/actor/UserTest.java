package org.nikitinia.patterns.behavior.mediator.actor;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;

class UserTest {

    @Test
    void checkUser() {
        User user = Mockito.mock(
                User.class,
                Mockito.CALLS_REAL_METHODS);

        assertThat(user)
                .hasFieldOrProperty("documentSystem")
                .hasFieldOrProperty("name")
                .hasFieldOrProperty("isEnabled");

    }

    @Test
    void user_shouldSendDocument_firstVariant() {
        User user = Mockito.mock(
                User.class,
                Mockito.CALLS_REAL_METHODS);

        Document document = DocumentCreator.documentBuild();

        ArgumentCaptor<Document> valueCapture = ArgumentCaptor.forClass(Document.class);

        doNothing()
                .when(user)
                .sendDocument(valueCapture.capture());

        user.sendDocument(document);

        assertEquals(document, valueCapture.getValue());
    }

    @Test
    void user_shouldSendDocument_secondVariant() {
        User user = Mockito.mock(
                User.class,
                Mockito.CALLS_REAL_METHODS);

        Document document = DocumentCreator.documentBuild();

        doAnswer( invocation -> {
            Object arg = invocation.getArgument(0);

            assertEquals(document, arg);
            return null;
        }).when(user).sendDocument(any(Document.class));

        user.sendDocument(document);

    }

}