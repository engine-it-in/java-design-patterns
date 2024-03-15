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
 * В чем выгода -> Единая точка работы с функционалом;
 */
public class NotificationService {

    /*Создаем справочник типов отправки и самих оповещений*/
    @Getter
    private final Map<NotificationType, Notification> notificationMap;

    /*В конструкторе регистрируем все доступные нам отправки*/
    public NotificationService() {
        List<Notification> notificationList = registerNotification();
        this.notificationMap = notificationList.stream().collect(Collectors.toMap(Notification::getType, t->t));
    }

    /*Список типов отправки*/
    private List<Notification> registerNotification() {
        List<Notification> list = new ArrayList<>();
        list.add(new SMSNotification());
        list.add(new TelegramNotification());
        list.add(new EmailNotification());
        return list;
    }
    public void send(NotificationInfo notificationInfo) {
        /*По типу сообщения определяем, как его отправлять*/
        Notification notification = notificationMap.get(notificationInfo.getNotificationType());
        /*Отправляем документ, конкретным каналом*/
        notification.send(notificationInfo);
    }

}
