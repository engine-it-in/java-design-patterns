package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.nikitinia.patterns.creating.abstractfactory.action.Certify;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;
import org.nikitinia.patterns.creating.abstractfactory.action.factory.EducationAttributeFactory;

/**
 * Что -> ?
 * Для чего -> ?
 * Реализация -> ?
 * Ценность -> ?
 */
public class MasterAttributeSet implements EducationAttributeFactory {

    public Certify getDiploma() {
        return new MasterCertify();
    }

    public Rating getRating() {
        return new MasterRating();
    }

    public ScienceResearch getScientificWork() {
        return new MasterScientificWork();
    }

}
