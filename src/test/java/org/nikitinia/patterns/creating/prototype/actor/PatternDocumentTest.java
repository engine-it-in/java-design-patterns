package org.nikitinia.patterns.creating.prototype.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.prototype.action.Copy;

import static org.assertj.core.api.Assertions.assertThat;

class PatternDocumentTest {

    public static final String TEST = "string";

    private final PatternDocument patternDocument = new PatternDocument(TEST);

    @Test
    void checkPatternDocument() {
        assertThat(patternDocument)
                .isInstanceOf(Copy.class)
                .hasFieldOrPropertyWithValue("name", TEST);
    }

    @Test
    void copyShouldReturnResult() {
        assertThat(patternDocument.copy())
                .usingRecursiveComparison()
                .isEqualTo(patternDocument);
    }

}