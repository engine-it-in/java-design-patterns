package org.nikitinia.patterns.structure.decorator.dictionary;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Что -> Локальный справочник с объектами шифрования/дешифрования;
 * Для чего -> Локальная логика, которая должна быть доступна только в рамках этого шаблона;
 * Реализация -> Enum;
 * Ценность -> Инкапсуляция изменяемой логика в конкретном классе;
 */
@AllArgsConstructor
@Getter
public enum TypeSecurity {

    ENCRYPT("encrypt"),

    DECRYPT("decrypt");

    final String value;

}
