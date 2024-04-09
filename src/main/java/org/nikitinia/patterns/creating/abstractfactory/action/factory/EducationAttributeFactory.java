package org.nikitinia.patterns.creating.abstractfactory.action.factory;


import org.nikitinia.patterns.creating.abstractfactory.action.Diploma;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.ScientificWork;

public interface EducationAttributeFactory {

    Diploma getDiploma();

    Rating getRating();

    ScientificWork getScientificWork();

}
