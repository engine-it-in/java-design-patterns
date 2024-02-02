package org.nikitinia.patterns.structure.facade.dictionary;

import lombok.AllArgsConstructor;

import java.util.Random;

/*
 * Что -> ;
 * Для чего -> ;
 * Реализация -> ;
 * В чем выгода -> ;
 * */
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
