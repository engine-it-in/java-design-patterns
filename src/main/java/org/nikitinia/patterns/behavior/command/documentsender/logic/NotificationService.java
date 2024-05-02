package org.nikitinia.patterns.behavior.command.documentsender.logic;

import lombok.Getter;
import org.nikitinia.patterns.behavior.command.documentsender.action.EmailNotification;
import org.nikitinia.patterns.behavior.command.documentsender.action.Notification;
import org.nikitinia.patterns.behavior.command.documentsender.action.SMSNotification;
import org.nikitinia.patterns.behavior.command.documentsender.action.TelegramNotification;
import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Что -> Общая логика работы с сервисом;
 * Для чего -> Единая точка работы с классами;
 * Реализация -> Класс, направляющий логику работы с данными;
 * Ценность -> Единая точка работы с функционалом;
 */
public class NotificationService {

    @Getter
    private final Map<NotificationType, Notification> notificationMap;

    public NotificationService() {
        List<Notification> notificationList = registerNotification();
        this.notificationMap = notificationList.stream().collect(Collectors.toMap(Notification::getType, t -> t));
    }

    private List<Notification> registerNotification() {
        List<Notification> list = new ArrayList<>();
        list.add(new SMSNotification());
        list.add(new TelegramNotification());
        list.add(new EmailNotification());
        return list;
    }

    public void send(NotificationInfo notificationInfo) {
        Notification notification = notificationMap.get(notificationInfo.getNotificationType());
        notification.send(notificationInfo);
    }

}
