package org.nikitinia.patterns.behavior.command.documentsender.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Класс, реализующий работу с оповещенем;
 * Для чего -> Инкапсулирует в абстракцию все зависимости, необходимые ля отправки сообщения;
 * Реализация -> Класс, содержащий атрибуды оповещения;
 * В чем выгода -> Удобный компонент для работы над определением что и как отправлять;
 */
@Getter
@Setter
@AllArgsConstructor
public class NotificationInfo {

    /*Документ, который будет отправляться*/
    private Document document;

    /*Способ, которым он будет доставляться*/
    private NotificationType notificationType;

}
