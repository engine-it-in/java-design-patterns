package org.nikitinia.patterns.behavior.templatemethod.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.BillCreator;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.model.documents.Bill;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class BillTemplateTest {

    private final Bill bill =
            BillCreator.billBuildWithNumberAndStatus(1.0, Status.DRAFT);
    private final BillTemplate billTemplate =
            new BillTemplate(bill);

    @Test
    void checkBillTemplate() {
        assertThat(billTemplate)
                .hasFieldOrPropertyWithValue("document", bill)
                .isInstanceOf(DocumentTemplate.class);
    }

    @Test
    void addLink_shouldReturnResult() {
        HashMap<Double, Document> documentDictionary = new HashMap<>();
        documentDictionary.put(bill.getNumber() + 10, bill);

        assertThat(billTemplate.addLink(bill))
                .usingRecursiveComparison()
                .isEqualTo(documentDictionary);
    }

    @Test
    void modifyDocument_shouldReturnResult() {

        billTemplate.modifyDocument(bill);

        assertThat(bill)
                .isInstanceOfSatisfying(Document.class, document -> {

                    assertThat(document.getSignatory())
                            .isEqualTo(bill.getSignatory());

                    assertThat(document.getStatus())
                            .isEqualTo(Status.SIGN);

                });
    }

}