package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Getter;
import lombok.Setter;


/**
 * Что -> Хранитель через который мы работаем со снимком;
 * Для чего -> Для инкапсуляции снимка в отдельный класс;
 * Реализация -> Класс, с методами доступа/загрузки хранителя;
 * Ценность -> Не нарушаем инкапсуляцию и делегируем ответсвенность;
 */
public class Repository {

    @Getter
    @Setter
    private Memento memento;

}
