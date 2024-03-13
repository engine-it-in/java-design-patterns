package org.nikitinia.patterns.creating.factorymethod.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.builder.actor.OfficalDocument;

import static org.assertj.core.api.Assertions.assertThat;

class OfficialDocumentCreatorTest {

    private final OfficialDocumentCreator officialDocumentCreator =
            new OfficialDocumentCreator();

    @Test
    void checkOfficialDocumentCreator() {
        assertThat(officialDocumentCreator)
                .hasNoNullFieldsOrProperties()
                .isInstanceOf(DocumentCreator.class);
    }

    @Test
    void createDocument_shouldReturnResult() {
        assertThat(officialDocumentCreator.createDocument())
                .usingRecursiveComparison()
                .isEqualTo(new OfficalDocument());
    }



}