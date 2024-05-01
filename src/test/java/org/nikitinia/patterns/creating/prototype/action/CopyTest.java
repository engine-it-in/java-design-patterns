package org.nikitinia.patterns.creating.prototype.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.prototype.actor.PatternDocument;

import static org.assertj.core.api.Assertions.assertThat;

class CopyTest {

    public static final String TEST = "string";

    private CopyClone copyClone = new CopyClone();

    class CopyClone implements Copy {

        @Override
        public PatternDocument copy() {
            return new PatternDocument(TEST);
        }
    }

    @Test
    void checkCopy() {
        assertThat(copyClone)
                .isInstanceOf(Copy.class)
                .hasNoNullFieldsOrProperties();
    }

    @Test
    void copyShouldReturnPatternDocument() {
        assertThat(copyClone.copy())
                .isInstanceOf(PatternDocument.class);
    }

}