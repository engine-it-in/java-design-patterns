package org.nikitinia.patterns.behavior.command.documentsender.actor;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Что -> Справочник типов отправки сообщений;
 * Для чего -> Типы отправки, сосредоточены в одном месте;
 * Реализация -> Enum, внутренний справочник;
 * Ценность -> Единая точка работы с данными;
 */
@AllArgsConstructor
public enum NotificationType {

    TELEGRAM ("Телеграмм"),
    SMS ("смс"),
    EMAIL ("Электронное сообщение");

    final String rusName;

    static List<String> getNotificationTypeRusNameList() {
        List<String> list = new ArrayList<>();
        for (NotificationType item: NotificationType.values()) {
            list.add(item.rusName);
        };
        return list;
    }

    static List<NotificationType> getNotificationTypeList() {
        return Arrays.asList(NotificationType.values());

    }

}
