package org.nikitinia.patterns.structure.facade.dictionary;

import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
public enum TypeMobile {

    ANDROID("ANDROID"),

    IOS("IOS"),

    WINDOWS("WINDOWS");

    private final String typeMobile;

    public static TypeMobile randomType() {
        TypeMobile[] typeMobiles = values();
        return typeMobiles[new Random().nextInt(typeMobiles.length)];
    }

}
