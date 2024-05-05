package org.nikitinia.patterns.behavior.command.documentsender.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationType;
import org.nikitinia.patterns.behavior.command.documentsender.logic.NotificationService;

public class Program {

    public static void main(String[] args) {

        NotificationService notificationService =
                new NotificationService();

        NotificationInfo notificationInfo =
                new NotificationInfo(DocumentCreator.documentBuild(), NotificationType.TELEGRAM);

        notificationService.send(notificationInfo);
    }

}
