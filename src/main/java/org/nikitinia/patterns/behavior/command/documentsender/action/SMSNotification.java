package org.nikitinia.patterns.behavior.command.documentsender.action;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

@Slf4j
public class SMSNotification implements Notification {

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

}
