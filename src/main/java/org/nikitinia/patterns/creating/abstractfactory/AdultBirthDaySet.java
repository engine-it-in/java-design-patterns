package org.nikitinia.patterns.creating.abstractfactory;

public class AdultBirthDaySet implements BirthDayFactory{

    public Gift getGift() {
        return new AdultGift();
    }

    public Card getCard() {
        return new AdultCard();
    }

    public Cake getCake() {
        return new AdultCake();
    }

}
