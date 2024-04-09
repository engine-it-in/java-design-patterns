package org.nikitinia.patterns.creating.abstractfactory.logic;

import org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree.MasterAttributeSet;
import org.nikitinia.patterns.creating.abstractfactory.action.factory.EducationAttributeFactory;
import org.nikitinia.patterns.creating.abstractfactory.actor.bachelor.BachelorAttributeSet;

public class Program {

    public static void main(String[] args) {
        MasterAttributeSet birthDaySetAdult = new MasterAttributeSet();
        BachelorAttributeSet birthDaySetKid = new BachelorAttributeSet();
        System.out.println(doParty(birthDaySetAdult));
        System.out.println(doParty(birthDaySetKid));
    }

    public static String doParty (EducationAttributeFactory educationAttributeFactory) {
        return educationAttributeFactory.getRating().getGrade() + " and " +
                educationAttributeFactory.getDiploma().getDocument() + " and " +
                educationAttributeFactory.getScientificWork().getWork();
    }
}
