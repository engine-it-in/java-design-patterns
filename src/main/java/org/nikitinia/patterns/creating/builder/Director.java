package org.nikitinia.patterns.creating.builder;

import lombok.Setter;

@Setter
public class Director {

    Builder builder;

    House houseBuilder() {
        builder.createHouse();
        builder.buildFloor();
        builder.buildPrice();
        builder.buildFloor();
        builder.buildRoof();
        builder.buildWalls();
        return builder.getHouse();
    }

}
