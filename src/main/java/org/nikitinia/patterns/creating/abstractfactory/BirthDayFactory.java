package org.nikitinia.patterns.creating.abstractfactory;

public interface BirthDayFactory {

    Gift getGift();

    Card getCard();

    Cake getCake();

}
