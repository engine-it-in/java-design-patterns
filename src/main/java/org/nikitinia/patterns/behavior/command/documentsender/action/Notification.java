package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationInfo;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

import static org.nikitinia.patterns.behavior.command.util.Constant.CommandMessage.SEND_MESSAGE_TEXT;

public interface Notification {

    default void send(NotificationInfo notificationInfo) {
        System.out.println(
                String.format(
                        SEND_MESSAGE_TEXT,
                        notificationInfo.getDocument().toString(),
                        getType().toString()));
    }

    NotificationType getType();


}
