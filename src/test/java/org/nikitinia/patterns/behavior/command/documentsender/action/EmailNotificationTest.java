package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.nikitinia.patterns.behavior.command.util.Constant.CommandMessage.SEND_MESSAGE_TEXT;

class EmailNotificationTest {

    private final EmailNotification emailNotification =
            new EmailNotification();
    private final Document document =
            DocumentCreator.documentBuild();

    private final NotificationInfo notificationInfo =
            new NotificationInfo(document, emailNotification.getType());

    private final ByteArrayOutputStream outputStreamCaptor =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void getType_shouldReturnType() {
        assertThat(emailNotification.getType())
                .isEqualTo(NotificationType.EMAIL);
    }

    @Test
    void send_shouldReturnResult() {
        emailNotification.send(notificationInfo);

        assertEquals(
                String.format(
                        SEND_MESSAGE_TEXT,
                        notificationInfo.getDocument().toString(),
                        emailNotification.getType().toString())
                , outputStreamCaptor.toString().trim()
        );

    }

}