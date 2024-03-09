package org.nikitinia.patterns.creating.builder;

public class Program {

    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new FirstTypeHouse());
        House houseFirstType = director.houseBuilder();
        System.out.println(houseFirstType);

        director.setBuilder(new SecondTypeHouse());
        House houseSecondType = director.houseBuilder();
        System.out.println(houseSecondType);

    }

}
