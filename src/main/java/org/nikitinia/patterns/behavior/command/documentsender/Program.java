package org.nikitinia.patterns.behavior.command.documentsender;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;
import org.nikitinia.patterns.behavior.command.documentsender.logic.NotificationService;

public class Program {

    public static void main(String[] args) {

        /*Запускаем нашу логику*/
        NotificationService notificationService =
                new NotificationService();
        /*Связываем документ и телеграм рассылку*/
        NotificationInfo notificationInfo =
                new NotificationInfo(DocumentCreator.documentBuild(), NotificationType.TELEGRAM);
        /*Отправляем документ*/
        notificationService.send(notificationInfo);
    }

}
