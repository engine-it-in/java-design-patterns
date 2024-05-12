package org.nikitinia.patterns.creating.prototype.actor;

import lombok.AllArgsConstructor;

/**
 * Что -> ?;
 * Для чего -> ?;
 * Реализация -> ?;
 * Ценность -> ?;
 */
@AllArgsConstructor
public class DocumentFactory {

    PatternDocument patternDocument;

    public PatternDocument cloneShape() {
        return patternDocument.copy();
    }

}
