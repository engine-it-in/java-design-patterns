package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationType;

/**
 * Что -> Конкретный тип оповещения;
 * Для чего -> Маркер для конкретного типа смс оповещения, который будет направлять логику работы шаблона;
 * Реализация -> Класс, реализующий интерфейс;
 * Ценность -> Реализация конкретной логики;
 */
public class SMSNotification implements Notification {

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

}
