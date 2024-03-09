package org.nikitinia.patterns.creating.builder.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.creating.builder.action.Builder;
import org.nikitinia.patterns.creating.builder.action.Director;

import static org.assertj.core.api.Assertions.assertThat;

class MinistryDocumentTest {

    private final Document document =
            DocumentCreator.documentBuildWithNumber(1.0);
    private final MinistryDocument ministryDocument =
            new MinistryDocument(document);

    private final Director director =
            new Director(ministryDocument);

    @Test
    void checkCityDocument() {
        assertThat(ministryDocument)
                .isInstanceOf(Builder.class)
                .hasFieldOrPropertyWithValue("document", document);
    }

    @Test
    void buildName_shouldReturnResult() {
        assertThat(director.documentBuilder().getName())
                .isEqualTo(MinistryDocument.class.getSimpleName() + " - " + "name");
    }

    @Test
    void buildType_shouldReturnResult() {
        assertThat(director.documentBuilder().getType())
                .isEqualTo(MinistryDocument.class.getSimpleName() + " - " + "type");
    }

    @Test
    void buildSignatory_shouldReturnResult() {
        assertThat(director.documentBuilder().getSignatory())
                .isEqualTo(MinistryDocument.class.getSimpleName() + " - " + "signatory");
    }

    @Test
    void buildDocument_shouldReturnResult() {
        assertThat(director.documentBuilder().getDocument())
                .isEqualTo(document);
    }

}