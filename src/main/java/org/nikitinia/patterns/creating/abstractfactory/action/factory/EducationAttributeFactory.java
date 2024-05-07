package org.nikitinia.patterns.creating.abstractfactory.action.factory;


import org.nikitinia.patterns.creating.abstractfactory.action.Certify;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;

/**
 * Что -> Контракт абстрактной фабрики;
 * Для чего -> Регламентация набора значений, которые являются результатом работы абстрактной фабрики;
 * Реализация -> Интерфейс;
 * Ценность -> Регламентация набора параметров, которые могут быть возвращены абстрактной фабрикой;
 */
public interface EducationAttributeFactory {

    Certify getDiploma();

    Rating getRating();

    ScienceResearch getScientificWork();

}
