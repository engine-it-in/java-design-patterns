package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

/*
 * Что -> Конкретный тип оповещения;
 * Для чего -> Маркер для конкреного типа смс оповещения, который будет направлять логику работы шаблона;
 * Реализация -> Класс, реализующий интерфейс;
 * */
public class SMSNotification implements Notification {

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

}
