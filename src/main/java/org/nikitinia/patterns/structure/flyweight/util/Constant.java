package org.nikitinia.patterns.structure.flyweight.util;

import lombok.experimental.UtilityClass;

/*
 * Что -> Класс для работы с конкретными константами;
 * Для чего -> Инкапсуляция констант в отдельный программный объект;
 * Реализация -> Класс, cодержащий приватный конструктор;
 * В чем выгода -> Приватность конструктора (@UtilityClass) гарантирует то,
 что этот класс будет создан в единственном экземпляре при выполнении программы;
 * */
@UtilityClass
public class Constant {

    @UtilityClass
    public class MainValue {

        public static final String ORDER_VALUE = "order";
        public static final String NOTE_VALUE = "note";

    }

}
