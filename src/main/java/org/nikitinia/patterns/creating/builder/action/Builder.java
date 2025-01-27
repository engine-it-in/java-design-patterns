package org.nikitinia.patterns.creating.builder.action;

import lombok.Getter;
import org.nikitinia.patterns.creating.builder.actor.OfficalDocument;

/**
 * Что -> Класс, содержащий общие шаги конструирования объекта;
 * Для чего -> Выделение основных этапов создания объекта;
 * Реализация -> Абстрактный класс;
 * Ценность -> Регламентация шагов с необходимостью их переопределения;
 */
@Getter
public abstract class Builder {

    public OfficalDocument officalDocument;

    void createOfficialDocument() {
        officalDocument = new OfficalDocument();
    }

    protected abstract void buildName();

    protected abstract void buildType();

    protected abstract void buildSignatory();

    protected abstract void buildDocument();

}
