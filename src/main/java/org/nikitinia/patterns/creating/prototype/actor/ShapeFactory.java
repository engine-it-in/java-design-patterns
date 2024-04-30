package org.nikitinia.patterns.creating.prototype.actor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShapeFactory {

    Shape shape;

    public Shape cloneShape() {
        return shape.copy();
    }

}
