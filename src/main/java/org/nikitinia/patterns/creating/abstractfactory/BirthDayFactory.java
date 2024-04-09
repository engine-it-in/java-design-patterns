package org.nikitinia.patterns.creating.abstractfactory;

import org.nikitinia.patterns.creating.abstractfactory.action.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.Diploma;

public interface BirthDayFactory {

    Diploma getGift();

    Rating getCard();

    ScientificWork getCake();

}
