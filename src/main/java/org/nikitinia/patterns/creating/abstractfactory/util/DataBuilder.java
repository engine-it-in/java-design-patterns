package org.nikitinia.patterns.creating.abstractfactory.util;

import lombok.experimental.UtilityClass;

import java.util.List;

/**
 * Что -> Класс для работы с конкретными константами и значениями;
 * Для чего -> Инкапсуляция констант и утилитарных методов в отдельный программный объект;
 * Реализация -> Класс, с приватным конструктором;
 * Ценность -> Приватность конструктора (@UtilityClass) гарантирует то,
 что этот класс будет создан в единственном экземпляре при выполнении программы;
 */
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
