package org.nikitinia.patterns.creating.abstractfactory.util;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class DataBuilder {

    public static final String MATH = "Higher Math";
    public static final String HISTORY = "History";
    public static final String LANGUAGE = "Language";

    public static List<String> getSubjectForBachelor() {
        return List.of(
                MATH,
                HISTORY
        );
    }

    public static List<String> getSubjectForMaster() {
        return List.of(
                MATH,
                HISTORY,
                LANGUAGE
        );
    }

}
