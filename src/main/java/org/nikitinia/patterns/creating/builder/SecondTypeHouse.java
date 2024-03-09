package org.nikitinia.patterns.creating.builder;

public class SecondTypeHouse extends Builder {
    @Override
    void buildWalls() {
        house.setWalls(SecondTypeHouse.class.getCanonicalName() + "walls");
    }

    @Override
    void buildFloor() {
        house.setFloor(SecondTypeHouse.class.getCanonicalName() + "floor");

    }

    @Override
    void buildRoof() {
        house.setRoof(SecondTypeHouse.class.getCanonicalName() + "roof");
    }

    @Override
    void buildPrice() {
        house.setPrice(2);
    }
}
