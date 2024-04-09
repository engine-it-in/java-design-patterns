package org.nikitinia.patterns.creating.abstractfactory;

import org.nikitinia.patterns.creating.abstractfactory.action.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.Diploma;

public class AdultBirthDaySet implements BirthDayFactory{

    public Diploma getGift() {
        return new AdultDiploma();
    }

    public Rating getCard() {
        return new AdultRating();
    }

    public ScientificWork getCake() {
        return new AdultCake();
    }

}
