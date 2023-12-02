package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nikitinia.patterns.behavior.command.util.Constant.CommandMessage.SEND_MESSAGE_TEXT;

class SMSNotificationTest {

    private final SMSNotification smsNotification =
            new SMSNotification();

    private final Document document =
            DocumentCreator.documentBuild();
    NotificationInfo notificationInfo =
            new NotificationInfo(document, smsNotification.getType());

    private ByteArrayOutputStream outputStreamCaptor =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void getType_ShouldReturnResult() {
        assertThat(smsNotification.getType())
                .isEqualTo(NotificationType.SMS);
    }

    @Test
    void send_shouldReturnResult() {
        smsNotification.send(notificationInfo);

        Assertions.assertEquals(
                String.format(
                        SEND_MESSAGE_TEXT,
                        notificationInfo.getDocument().toString(),
                        smsNotification.getType().toString())
                , outputStreamCaptor.toString().trim());
    }

}