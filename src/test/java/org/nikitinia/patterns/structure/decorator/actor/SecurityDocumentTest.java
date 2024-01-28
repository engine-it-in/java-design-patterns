package org.nikitinia.patterns.structure.decorator.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import static org.assertj.core.api.Assertions.assertThat;

class SecurityDocumentTest {


    private final Document document =
            DocumentCreator.documentBuildWithNumber(1.0);
    private final SecurityDocument securityDocument =
            new SecurityDocument(
                    document,
                    "typeSecurity"
            );

    @Test
    void checkSecurityDocument() {
        assertThat(securityDocument)
                .isInstanceOf(Document.class)
                .hasFieldOrPropertyWithValue("document", null)
                .hasFieldOrPropertyWithValue("typeSecurity", "typeSecurity")
                .isInstanceOfSatisfying(SecurityDocument.class, securityDocumentData -> {

                    assertThat(securityDocumentData.getNumber())
                            .isEqualTo(document.getNumber());

                    assertThat(securityDocumentData.getSignatory())
                            .isEqualTo(document.getSignatory());

                    assertThat(securityDocumentData.getStatus())
                            .isEqualTo(document.getStatus());

                    assertThat(securityDocumentData.getType())
                            .isEqualTo(document.getType());

                    assertThat(securityDocumentData.getTextField())
                            .isEqualTo(document.getTextField());

                });
    }


}