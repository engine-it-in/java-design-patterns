package org.nikitinia.patterns.structure.decorator.action;

import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

/**
 * Что -> Класс, реализующий поведение отправки данных, имплементирующий базовое поведение, необходимое к декорации;
 * Для чего -> Выполнение конкретных действий;
 * Реализация -> Основные действия;
 * Ценность -> Выполнение основных действий;
 */
public class SecuritySender implements Sender {
    @Override
    public String send(SecurityDocument document) {
        return String.format("Send document number %.0f;", document.getNumber());
    }
}
