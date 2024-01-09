package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationType;

/*
 * Что -> Конкретный тип оповещения;
 * Для чего -> Маркер для конкреного типа telegram оповещения, который будет направлять логику работы шаблона;
 * Реализация -> Класс, реализующий интерфейс;
 * */
public class TelegramNotification implements Notification {

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }
}
