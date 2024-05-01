package org.nikitinia.patterns.creating.prototype.actor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentFactoryTest {

    public static final String TEST = "string";

    private final PatternDocument patternDocument = new PatternDocument(TEST);

    private final DocumentFactory documentFactory =
            new DocumentFactory(patternDocument);

    @Test
    void checkDocumentFactory() {
        assertThat(documentFactory)
                .hasFieldOrPropertyWithValue("patternDocument", patternDocument);
    }

    @Test
    void cloneShapeShouldReturnResult() {
        assertThat(documentFactory.cloneShape())
                .usingRecursiveComparison()
                .isEqualTo(patternDocument);
    }

}