package org.nikitinia.patterns.behavior.command.documentsender.action;

import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

/*
* Тип оповещения - берем из системного справочника, остальное делегировано в интерфейс
* */
public class EmailNotification implements Notification{

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

}
