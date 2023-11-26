package org.nikitinia.patterns.behavior.command.documentsender.run;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;
import org.nikitinia.patterns.behavior.command.documentsender.logic.NotificationService;

@AllArgsConstructor
public class Program {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        NotificationInfo notificationInfo = new NotificationInfo(DocumentCreator.documentBuild(), NotificationType.TELEGRAM);

        notificationService.send(notificationInfo);
    }

}
