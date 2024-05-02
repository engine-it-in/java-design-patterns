package org.nikitinia.patterns.structure.facade.dictionary;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Что -> Локальный справочник с данными;
 * Для чего -> Локальные значения, требуемые только в рамках данного шаблона;
 * Реализация -> Enum;
 * Ценность -> Локальные значения, требуемые только в конкретном месте;
 */
@AllArgsConstructor
public enum TypeMobile {

    ANDROID,

    IOS,

    WINDOWS;

    public static TypeMobile randomType() {
        TypeMobile[] typeMobiles = values();
        return typeMobiles[new Random().nextInt(typeMobiles.length)];
    }
}
