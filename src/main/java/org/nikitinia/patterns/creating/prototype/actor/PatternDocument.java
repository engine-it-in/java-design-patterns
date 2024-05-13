package org.nikitinia.patterns.creating.prototype.actor;

import lombok.*;
import org.nikitinia.patterns.creating.prototype.action.Copy;

/**
 * Что -> Основной объект для которого нужно будет создать прототип;
 * Для чего -> Создание прототип через реализацию интерфейсного метода;
 * Реализация -> Класс, имплементирующий метод прототипа;
 * Ценность -> Типизация класса методом копирования основного объекта;
 */
@Getter
@Setter
@ToString
public class PatternDocument implements Copy {

    private String name;

    public PatternDocument(String name) {
        this.name = name;
    }


    @Override
    public PatternDocument copy() {
        return new PatternDocument(name);
    }

}
