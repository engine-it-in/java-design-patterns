package org.nikitinia.patterns.behavior.command.documentsender.action;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.behavior.command.documentsender.data.NotificationType;

/*
 * Тип оповещения - берем из системного справочника, остальное делегировано в интерфейс
 * */
public class TelegramNotification implements Notification {

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }
}
