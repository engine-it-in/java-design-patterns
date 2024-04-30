package org.nikitinia.patterns.creating.prototype.logic;

import org.nikitinia.patterns.creating.prototype.actor.Shape;
import org.nikitinia.patterns.creating.prototype.actor.ShapeFactory;

public class Program {

    public static void main(String[] args) {
        Shape shapeFirst = new Shape("triangle", "red");
        System.out.print(shapeFirst);
        ShapeFactory shapeFactory = new ShapeFactory(shapeFirst);
        System.out.print(shapeFactory.cloneShape());
    }

}
