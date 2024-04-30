package org.nikitinia.patterns.creating.prototype.actor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShapeFactory {

    PatternDocument patternDocument;

    public PatternDocument cloneShape() {
        return patternDocument.copy();
    }

}
