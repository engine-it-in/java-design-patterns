package org.nikitinia.patterns.behavior.command.documentsender.data;

import lombok.AllArgsConstructor;

@AllArgsConstructor
/*
* Справочник способов отправки
* */
public enum NotificationType {

    TELEGRAM ("Телеграмм"),
    SMS ("смс"),
    EMAIL ("Электронное сообщение");

    final String rusName;

}
