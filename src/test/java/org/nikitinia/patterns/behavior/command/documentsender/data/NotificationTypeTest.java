package org.nikitinia.patterns.behavior.command.documentsender.data;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class NotificationTypeTest {

    @ParameterizedTest
    @EnumSource(NotificationType.class)
    void notificationType_shouldGetValue(NotificationType notificationType) {
        assertThat(notificationType)
                .isIn(NotificationType.getNotificationTypeList());
    }

    @ParameterizedTest
    @EnumSource(NotificationType.class)
    void notificationType_shouldGetRusNameValue(NotificationType notificationType) {
        assertThat(notificationType.rusName)
                .isIn(NotificationType.getNotificationTypeRusNameList());
    }

}