package org.nikitinia.patterns.creating.abstractfactory;

public class Program {

    public static void main(String[] args) {
        AdultBirthDaySet birthDaySet = new AdultBirthDaySet();
        System.out.println(doParty(birthDaySet));
    }

    public static String doParty (BirthDayFactory birthDayFactory) {
        return birthDayFactory.getCard().getName() + " and " +
                birthDayFactory.getGift().getName() + " and " +
                birthDayFactory.getCake().getName();
    }
}
