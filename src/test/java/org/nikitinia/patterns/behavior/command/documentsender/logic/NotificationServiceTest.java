package org.nikitinia.patterns.behavior.command.documentsender.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentsender.action.EmailNotification;
import org.nikitinia.patterns.behavior.command.documentsender.action.Notification;
import org.nikitinia.patterns.behavior.command.documentsender.action.SMSNotification;
import org.nikitinia.patterns.behavior.command.documentsender.action.TelegramNotification;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.nikitinia.patterns.behavior.command.util.Constant.CommandMessage.SEND_MESSAGE_TEXT;

class NotificationServiceTest {

    private final NotificationService notificationService =
            new NotificationService();

    private ByteArrayOutputStream outputStreamCaptor =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest
    @EnumSource(NotificationType.class)
    void check_NotificationService_containsNotificationType(NotificationType notificationType) {

        assertThat(
                notificationService
                        .getNotificationMap()
                        .containsKey(notificationType)
        ).isTrue();
    }

    @ParameterizedTest
    @MethodSource("provideTestDataNotification")
    void check_NotificationService_containsNotification(NotificationType notificationType, Notification notification) {
        assertThat(
                notificationService
                        .getNotificationMap()
                        .get(notificationType))
                .isInstanceOf(notification.getClass());
    }


    @ParameterizedTest
    @MethodSource("provideTestDataNotification")
    void send_shouldDo(NotificationType notificationType) {
        Document document = DocumentCreator.documentBuild();
        NotificationInfo notificationInfo = new NotificationInfo(document, notificationType);

        notificationService.send(notificationInfo);

        assertEquals(
                String.format(
                        SEND_MESSAGE_TEXT,
                        notificationInfo.getDocument().toString(),
                        notificationType.toString())
                , outputStreamCaptor.toString().trim());
    }

    private static Stream<Arguments> provideTestDataNotification() {
        return Stream.of(
                Arguments.of(NotificationType.TELEGRAM, new TelegramNotification()),
                Arguments.of(NotificationType.SMS, new SMSNotification()),
                Arguments.of(NotificationType.EMAIL, new EmailNotification())
        );
    }

}