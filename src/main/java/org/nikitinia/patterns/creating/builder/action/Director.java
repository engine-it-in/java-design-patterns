package org.nikitinia.patterns.creating.builder.action;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.creating.builder.actor.OfficalDocument;

/**
 * Что -> Компонент, определяющий алгоритм создания объекта;
 * Для чего -> Регламентация действия по созданию объекта;
 * Реализация -> Конкретный класс;
 * Ценность -> Формализация необходимой последовательности действий;
 */
@AllArgsConstructor
public class Director {

    Builder builder;

    public OfficalDocument documentBuilder() {
        builder.createOfficialDocument();
        builder.buildType();
        builder.buildDocument();
        builder.buildType();
        builder.buildSignatory();
        builder.buildName();
        return builder.getOfficalDocument();
    }

}
