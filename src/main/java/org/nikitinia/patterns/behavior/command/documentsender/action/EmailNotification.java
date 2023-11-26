package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

public class EmailNotification implements Notification{

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

}
