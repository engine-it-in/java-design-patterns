package org.nikitinia.patterns.behavior.command.util;

import lombok.experimental.UtilityClass;

/*
 * Что -> Репозиторий константам;
 * Для чего -> Единое место хранения констант позволяет удобно управлять их содержимым;
 * Реализация -> Утилитарный класс;
 * */
@UtilityClass
public class Constant {

    @UtilityClass
    public class CommandMessage {
        public static final String SEND_MESSAGE_TEXT = "Отправляем сообщение %s в %s";
    }

}
