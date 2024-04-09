package org.nikitinia.patterns.creating.abstractfactory;

public class Program {

    public static void main(String[] args) {
        AdultBirthDaySet birthDaySetAdult = new AdultBirthDaySet();
        KidsBirthDaySet birthDaySetKid = new KidsBirthDaySet();
        System.out.println(doParty(birthDaySetAdult));
        System.out.println(doParty(birthDaySetKid));
    }

    public static String doParty (BirthDayFactory birthDayFactory) {
        return birthDayFactory.getCard().getName() + " and " +
                birthDayFactory.getGift().getDocument() + " and " +
                birthDayFactory.getCake().getName();
    }
}
