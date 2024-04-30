package org.nikitinia.patterns.creating.abstractfactory.action.factory;


import org.nikitinia.patterns.creating.abstractfactory.action.Certify;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;

public interface EducationAttributeFactory {

    Certify getDiploma();

    Rating getRating();

    ScienceResearch getScientificWork();

}
