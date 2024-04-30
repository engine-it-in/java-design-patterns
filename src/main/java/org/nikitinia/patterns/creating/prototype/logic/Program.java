package org.nikitinia.patterns.creating.prototype.logic;

import org.nikitinia.patterns.creating.prototype.actor.PatternDocument;
import org.nikitinia.patterns.creating.prototype.actor.ShapeFactory;

public class Program {

    public static void main(String[] args) {
        PatternDocument patternDocumentFirst = new PatternDocument("triangle");
        System.out.print(patternDocumentFirst);
        ShapeFactory shapeFactory = new ShapeFactory(patternDocumentFirst);
        System.out.print(shapeFactory.cloneShape());
    }

}
