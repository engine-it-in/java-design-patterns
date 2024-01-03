package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.AgreementCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class AgreementTemplateTest {

    private final Agreement agreement =
            AgreementCreator.agreementBuildWithNumberAndStatus(1.0, Status.DRAFT);
    private final AgreementTemplate agreementTemplate =
            new AgreementTemplate(agreement);

    @Test
    void checkBillTemplate() {
        assertThat(agreementTemplate)
                .hasFieldOrPropertyWithValue("document", agreement)
                .isInstanceOf(DocumentTemplate.class);
    }

    @Test
    void addLink_shouldReturnResult() {
        HashMap<Double, Document> documentDictionary = new HashMap<>();
        documentDictionary.put(agreement.getNumber(), agreement);

        assertThat(agreementTemplate.addLink(agreement))
                .usingRecursiveComparison()
                .isEqualTo(documentDictionary);
    }

    @Test
    void modifyDocument_shouldReturnResult() {

        agreementTemplate.modifyDocument(agreement);

        assertThat(agreement)
                .isInstanceOfSatisfying(Document.class, document -> {

                    assertThat(document.getSignatory())
                            .isEqualTo(agreement.getSignatory());
                });
    }

}