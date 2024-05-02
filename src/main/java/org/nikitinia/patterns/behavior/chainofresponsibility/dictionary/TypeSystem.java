package org.nikitinia.patterns.behavior.chainofresponsibility.dictionary;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Что -> Внутренний справочник значений;
 * Для чего -> Значения для обработки логики в данном шаблоне;
 * Реализация -> Enum;
 * Ценность -> Локализация переменных в едином месте;
 */
@Getter
@AllArgsConstructor
public enum TypeSystem {

    TELEGRAM("Telegram"),
    EMAIL("Email"),
    SMS("SMS");

    final String system;
}
