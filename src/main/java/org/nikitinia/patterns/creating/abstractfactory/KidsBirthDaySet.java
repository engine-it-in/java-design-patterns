package org.nikitinia.patterns.creating.abstractfactory;

public class KidsBirthDaySet implements BirthDayFactory{

    public Gift getGift() {
        return new KidGift();
    }

    public Card getCard() {
        return new KidCard();
    }

    public Cake getCake() {
        return new KidCake();
    }

}
