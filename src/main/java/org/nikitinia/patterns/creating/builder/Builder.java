package org.nikitinia.patterns.creating.builder;

import lombok.Getter;

@Getter
public abstract class Builder {

    House house;

    void createHouse() {
        house = new House();
    }

    abstract void buildWalls();

    abstract void buildFloor();

    abstract void buildRoof();

    abstract void buildPrice();


}
