package org.nikitinia.patterns.behavior.command.documentsender.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Класс, реализующий работу с оповещенем;
 * Для чего -> Инкапсулирует в абстракцию все зависимости, необходимые ля отправки сообщения;
 * Реализация -> Класс, содержащий атрибуды оповещения;
 * Ценность -> Удобный компонент для работы над определением что и как отправлять;
 */
@Getter
@Setter
@AllArgsConstructor
public class NotificationInfo {

    private Document document;

    private NotificationType notificationType;

}
