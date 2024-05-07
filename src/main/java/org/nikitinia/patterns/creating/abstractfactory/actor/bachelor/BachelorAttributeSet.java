package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.nikitinia.patterns.creating.abstractfactory.action.Certify;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;
import org.nikitinia.patterns.creating.abstractfactory.action.factory.EducationAttributeFactory;

/**
 * Что -> Реализация абстрактной фабрики для бакалавриата;
 * Для чего -> Формирования результата бакалавриата;
 * Реализация -> Класс;
 * Ценность -> Реализация бизнес логики;
 */
public class BachelorAttributeSet implements EducationAttributeFactory {

    public Certify getDiploma() {
        return new BachelorCertify();
    }

    public Rating getRating() {
        return new BachelorRating();
    }

    public ScienceResearch getScientificWork() {
        return new BachelorScientificWork();
    }

}
