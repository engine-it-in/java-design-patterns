package org.nikitinia.patterns.creating.abstractfactory;

import org.nikitinia.patterns.creating.abstractfactory.action.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.Diploma;

public class KidsBirthDaySet implements BirthDayFactory{

    public Diploma getGift() {
        return new KidDiploma();
    }

    public Rating getCard() {
        return new KidRating();
    }

    public ScientificWork getCake() {
        return new KidCake();
    }

}
