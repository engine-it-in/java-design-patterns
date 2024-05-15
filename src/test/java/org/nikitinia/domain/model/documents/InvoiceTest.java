package org.nikitinia.domain.model.documents;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.dictionaries.Type;
import org.nikitinia.domain.model.additional.TextField;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class InvoiceTest {

    private final static Double one = 1.0;
    private final static String TEST_STRING = "string";
    private final static Date date = new Date();
    private final static TextField textField = new TextField();

    private final Invoice invoice =
            new Invoice(one, TEST_STRING, Status.SIGN, Type.IOS, textField, TEST_STRING, date);

    @Test
    void checkInvoice() {
        assertThat(invoice)
                .isInstanceOf(Document.class)
                .hasFieldOrPropertyWithValue("number", one)
                .hasFieldOrPropertyWithValue("signatory", TEST_STRING)
                .hasFieldOrPropertyWithValue("status", Status.SIGN)
                .hasFieldOrPropertyWithValue("type", Type.IOS)
                .hasFieldOrPropertyWithValue("textField", textField)
                .hasFieldOrPropertyWithValue("product", TEST_STRING)
                .hasFieldOrPropertyWithValue("signDate", date)
        ;
    }

}