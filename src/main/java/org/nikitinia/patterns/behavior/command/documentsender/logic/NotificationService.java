package org.nikitinia.patterns.behavior.command.documentsender.logic;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.behavior.command.documentsender.action.EmailNotification;
import org.nikitinia.patterns.behavior.command.documentsender.action.Notification;
import org.nikitinia.patterns.behavior.command.documentsender.action.SMSNotification;
import org.nikitinia.patterns.behavior.command.documentsender.action.TelegramNotification;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* Наш логика
* */
public class NotificationService {

    /*
    * Создаем справочник типов отправки и самих оповещений
    * */
    private final Map<NotificationType, Notification> notificationMap;

    /*В конструкторе регистрируем все доступные нам отправки*/
    public NotificationService() {
        List<Notification> notificationList = registerNotification();
        this.notificationMap = notificationList.stream().collect(Collectors.toMap(Notification::getType, t->t));
    }

    /*Список типов отправки*/
    public List<Notification> registerNotification() {
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
