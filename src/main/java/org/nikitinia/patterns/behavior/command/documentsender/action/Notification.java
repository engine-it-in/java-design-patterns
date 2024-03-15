package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.actor.NotificationType;

import static org.nikitinia.patterns.behavior.command.util.Constant.CommandMessage.SEND_MESSAGE_TEXT;

/**
 * Что -> Это основа для "команды";
 * Для чего -> Этот интерфейс, который инкапсулирует корневую логику команды.
 * Тут использована дефолтная реализация интерфейса, то есть он будет использоваться в том, виде, как определен тут;
 * Реализация -> Создана в виде интерфейса. Оставляем систему гибкой для возможных изменений;
 */
public interface Notification {

    /*Суть отправки - отправляем конкретное сообщение*/
    default void send(NotificationInfo notificationInfo) {
        System.out.println(
                String.format(
                        SEND_MESSAGE_TEXT,
                        notificationInfo.getDocument().toString(),
                        getType().toString()));
    }

    /*Тип оповещения должен быть определен конкретной системой по своему*/
    NotificationType getType();


}
