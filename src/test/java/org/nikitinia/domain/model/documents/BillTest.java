package org.nikitinia.domain.model.documents;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.dictionaries.Type;
import org.nikitinia.domain.model.additional.TextField;

import java.math.BigDecimal;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class BillTest {

    private final static Double one = 1.0;
    private final static String TEST_STRING = "string";
    private final static Date date = new Date();
    private final static BigDecimal bigDecimal = new BigDecimal(one);
    private final static TextField textField = new TextField();

    private final Bill bill =
            new Bill(one, TEST_STRING, Status.PRESIGN, Type.ANDROID, textField, bigDecimal, date);

    @Test
    void checkBill() {
        assertThat(bill)
                .isInstanceOf(Document.class)
                .hasFieldOrPropertyWithValue("number", one)
                .hasFieldOrPropertyWithValue("signatory", TEST_STRING)
                .hasFieldOrPropertyWithValue("status", Status.PRESIGN)
                .hasFieldOrPropertyWithValue("type", Type.ANDROID)
                .hasFieldOrPropertyWithValue("textField", null)
                .hasFieldOrPropertyWithValue("sum", bigDecimal)
                .hasFieldOrPropertyWithValue("signDate", date)
        ;
    }

}