package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.nikitinia.patterns.creating.abstractfactory.action.factory.EducationAttributeFactory;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.Diploma;

public class MasterAttributeSet implements EducationAttributeFactory {

    public Diploma getDiploma() {
        return new MasterDiploma();
    }

    public Rating getRating() {
        return new MasterRating();
    }

    public ScientificWork getScientificWork() {
        return new MasterScientificWork();
    }

}
