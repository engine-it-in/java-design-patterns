package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.nikitinia.patterns.creating.abstractfactory.action.factory.EducationAttributeFactory;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.Diploma;

public class BachelorAttributeSet implements EducationAttributeFactory {

    public Diploma getDiploma() {
        return new BachelorDiploma();
    }

    public Rating getRating() {
        return new BachelorRating();
    }

    public ScientificWork getScientificWork() {
        return new BachelorScientificWork();
    }

}
