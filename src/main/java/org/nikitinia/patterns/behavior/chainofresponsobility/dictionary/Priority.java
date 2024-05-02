package org.nikitinia.patterns.behavior.chainofresponsobility.dictionary;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Что -> Внутренний справочник значений;
 * Для чего -> Значения для обработки логики в данном шаблоне;
 * Реализация -> Enum;
 * Ценность -> Локализация изменчивыз переменных в едином месте;
 */
@AllArgsConstructor
@Getter
public enum Priority {

    NORMAL (3),
    VIP (2),
    CRITICAL (1);

    final int level;

}
