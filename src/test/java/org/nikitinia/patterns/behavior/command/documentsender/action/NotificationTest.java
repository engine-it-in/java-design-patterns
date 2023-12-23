package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificationTest {

    Notification notification = () -> NotificationType.TELEGRAM;

    private final ByteArrayOutputStream outputStreamCaptor =
            new ByteArrayOutputStream();
    private final Document document =
            DocumentCreator.documentBuild();
    NotificationInfo notificationInfo =
            new NotificationInfo(document, NotificationType.TELEGRAM);

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void send_shouldDo() {

        notification.send(notificationInfo);

        assertEquals(
                "Отправляем сообщение Document" +
                        "{number='1.0', status='null, signatory='Signatory, " +
                        "textField=TextField{line=2', column=2', " +
                        "quantitySymbolLine=123', text='someText', buffer='null'}} " +
                        "в TELEGRAM",
                outputStreamCaptor.toString().trim()
        );
    }

    @Test
    void getType_shouldReturnResult() {
        assertThat(notification.getType())
                .isInstanceOf(NotificationType.class);
    }

}