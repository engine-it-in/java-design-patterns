package org.nikitinia.patterns.behavior.chainofresponsobility.dictionary;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Что -> Внутренний справочник значений;
 * Для чего -> Значения для обработки логики в данном шаблоне;
 * Реализация -> Enum;
 * Ценность -> Локализация изменчивыз переменных в едином месте;
 */
@Getter
@AllArgsConstructor
public enum TypeSystem {

    TELEGRAM("Telegram"),
    EMAIL("Email"),
    SMS("SMS");

    final String system;
}
