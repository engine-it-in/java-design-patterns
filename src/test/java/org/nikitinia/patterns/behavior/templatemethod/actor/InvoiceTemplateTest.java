package org.nikitinia.patterns.behavior.templatemethod.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.InvoiceCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.domain.model.documents.Invoice;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class InvoiceTemplateTest {

    private final Invoice invoice =
            InvoiceCreator.invoiceBuildWithNumberAndStatus(1.0, Status.DRAFT);
    private final InvoiceTemplate invoiceTemplate =
            new InvoiceTemplate(invoice);

    @Test
    void checkBillTemplate() {
        assertThat(invoiceTemplate)
                .hasFieldOrPropertyWithValue("document", invoice)
                .isInstanceOf(DocumentTemplate.class);
    }

    @Test
    void addLink_shouldReturnResult() {
        HashMap<Double, Document> documentDictionary = new HashMap<>();
        documentDictionary.put(invoice.getNumber() * 10, invoice);

        assertThat(invoiceTemplate.addLink(invoice))
                .usingRecursiveComparison()
                .isEqualTo(documentDictionary);
    }

    @Test
    void modifyDocument_shouldReturnResult() {

        invoiceTemplate.modifyDocument(invoice);

        assertThat(invoice)
                .isInstanceOfSatisfying(Document.class, document -> {

                    assertThat(document.getSignatory())
                            .isEqualTo(invoice.getSignatory());

                    assertThat(document.getStatus())
                            .isEqualTo(Status.PRESIGN);

                });
    }

}