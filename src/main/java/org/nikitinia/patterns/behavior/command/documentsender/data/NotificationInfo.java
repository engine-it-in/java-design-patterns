package org.nikitinia.patterns.behavior.command.documentsender.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

@Getter
@Setter
@AllArgsConstructor
/*
 * Информация для оповещения
 * Способ, которым он будет доставляться
 * */
public class NotificationInfo {

    /*
     * Документ, который будет отправляться;
     * */
    private Document document;

    /*
     * Способ, которым он будет доставляться
     * */
    private NotificationType notificationType;

}
