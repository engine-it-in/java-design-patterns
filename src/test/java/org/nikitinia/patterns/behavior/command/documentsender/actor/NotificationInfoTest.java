package org.nikitinia.patterns.behavior.command.documentsender.actor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import static org.assertj.core.api.Assertions.assertThat;

class NotificationInfoTest {

    private final Document document
            = DocumentCreator.documentBuild();

    @ParameterizedTest
    @EnumSource(NotificationType.class)
    void notificationInfo_shouldExist(NotificationType notificationType) {
        assertThat(new NotificationInfo(document, notificationType))
                .hasFieldOrPropertyWithValue("document", document)
                .hasFieldOrPropertyWithValue("notificationType", notificationType);
    }

}