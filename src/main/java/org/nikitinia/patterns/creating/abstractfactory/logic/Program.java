package org.nikitinia.patterns.creating.abstractfactory.logic;

import org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree.MasterAttributeSet;
import org.nikitinia.patterns.creating.abstractfactory.action.factory.EducationAttributeFactory;
import org.nikitinia.patterns.creating.abstractfactory.actor.bachelor.BachelorAttributeSet;

public class Program {

    public static void main(String[] args) {
        MasterAttributeSet masterAttributeSet = new MasterAttributeSet();
        BachelorAttributeSet bachelorAttributeSet = new BachelorAttributeSet();
        System.out.println(doEducation(masterAttributeSet));
        System.out.println(doEducation(bachelorAttributeSet));
    }

    public static String doEducation(EducationAttributeFactory educationAttributeFactory) {
        return educationAttributeFactory.getRating().getGrade() + " and " +
                educationAttributeFactory.getDiploma().getDocument() + " and " +
                educationAttributeFactory.getScientificWork().getWork();
    }
}
