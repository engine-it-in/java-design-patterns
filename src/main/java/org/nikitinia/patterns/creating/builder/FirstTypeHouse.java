package org.nikitinia.patterns.creating.builder;

public class FirstTypeHouse extends Builder {
    @Override
    void buildWalls() {
        house.setWalls(FirstTypeHouse.class.getCanonicalName() + "walls");
    }

    @Override
    void buildFloor() {
        house.setFloor(FirstTypeHouse.class.getCanonicalName() + "floor");

    }

    @Override
    void buildRoof() {
        house.setRoof(FirstTypeHouse.class.getCanonicalName() + "roof");
    }

    @Override
    void buildPrice() {
        house.setPrice(1);
    }
}
