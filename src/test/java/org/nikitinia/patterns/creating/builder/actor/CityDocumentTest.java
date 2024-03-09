package org.nikitinia.patterns.creating.builder.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.creating.builder.action.Builder;
import org.nikitinia.patterns.creating.builder.action.Director;

import static org.assertj.core.api.Assertions.assertThat;

class CityDocumentTest {

    private final Document document =
            DocumentCreator.documentBuildWithNumber(1.0);
    private final CityDocument cityDocument =
            new CityDocument(document);

    private final Director director =
            new Director(cityDocument);

    @Test
    void checkCityDocument() {
        assertThat(cityDocument)
                .isInstanceOf(Builder.class)
                .hasFieldOrPropertyWithValue("document", document);
    }

    @Test
    void buildName_shouldReturnResult() {
        assertThat(director.documentBuilder().getName())
                .isEqualTo(CityDocument.class.getSimpleName() + " : " + "name");
    }

    @Test
    void buildType_shouldReturnResult() {
        assertThat(director.documentBuilder().getType())
                .isEqualTo(CityDocument.class.getSimpleName() + " : " + "type");
    }

    @Test
    void buildSignatory_shouldReturnResult() {
        assertThat(director.documentBuilder().getSignatory())
                .isEqualTo(CityDocument.class.getSimpleName() + " : " + "signatory");
    }

    @Test
    void buildDocument_shouldReturnResult() {
        assertThat(director.documentBuilder().getDocument())
                .isEqualTo(document);
    }

}