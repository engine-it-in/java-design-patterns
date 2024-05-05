package org.nikitinia.patterns.behavior.mediator.util;

import lombok.experimental.UtilityClass;

/**
 * Что -> Класс с приватным конструктором;
 * Для чего -> Репозиторий констант;
 * Реализация -> Утилитарный класс;
 * Ценность -> Инкапсуляция констант в едином месте;
 */
@UtilityClass
public class Constant {

    public static final String TEST_NAME = "name";
    public static final String TEST_NAME_ANOTHER = "name_another";

}
