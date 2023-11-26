package org.nikitinia.patterns.behavior.command.documentsender.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

@Getter
@Setter
@AllArgsConstructor
public class NotificationInfo {

    private Document document;
    private NotificationType notificationType;

}
