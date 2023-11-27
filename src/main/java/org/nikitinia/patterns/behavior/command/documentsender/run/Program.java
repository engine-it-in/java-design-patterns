package org.nikitinia.patterns.behavior.command.documentsender.run;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;
import org.nikitinia.patterns.behavior.command.documentsender.logic.NotificationService;

@AllArgsConstructor
public class Program {

    public static void main(String[] args) {

        /*Запускаем нашу логику*/
        NotificationService notificationService = new NotificationService();
        /*Связываем документ и телеграм рассылку*/
        NotificationInfo notificationInfo = new NotificationInfo(DocumentCreator.documentBuild(), NotificationType.TELEGRAM);
        /*Отправляем документ*/
        notificationService.send(notificationInfo);
    }

}
