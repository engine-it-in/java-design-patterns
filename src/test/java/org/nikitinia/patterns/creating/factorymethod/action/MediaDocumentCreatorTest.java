package org.nikitinia.patterns.creating.factorymethod.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.factorymethod.actor.MediaDocument;

import static org.assertj.core.api.Assertions.assertThat;

class MediaDocumentCreatorTest {

    private final MediaDocumentCreator mediaDocumentCreator
            = new MediaDocumentCreator();

    @Test
    void checkMediaDocumentCreator() {
        assertThat(mediaDocumentCreator)
                .hasNoNullFieldsOrProperties()
                .isInstanceOf(DocumentCreator.class);
    }

    @Test
    void createDocument_shouldReturnResult() {
        assertThat(mediaDocumentCreator.createDocument())
                .usingRecursiveComparison()
                .isEqualTo(new MediaDocument());
    }

}