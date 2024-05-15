package org.nikitinia.domain.model.documents;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.dictionaries.Type;
import org.nikitinia.domain.model.additional.TextField;

import java.math.BigDecimal;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class AgreementTest {

    private final static Double one = 1.0;
    private final static String TEST_STRING = "string";
    private final static Date date = new Date();
    private final static BigDecimal bigDecimal = new BigDecimal(one);
    private final static TextField textField = new TextField();


    private final Agreement agreement =
            new Agreement(one, TEST_STRING, Status.SIGN, Type.ANDROID, bigDecimal, date, date, textField);

    @Test
    void checkAgreement() {
        assertThat(agreement)
                .isInstanceOf(Document.class)
                .hasFieldOrPropertyWithValue("number", one)
                .hasFieldOrPropertyWithValue("signatory", TEST_STRING)
                .hasFieldOrPropertyWithValue("status", Status.SIGN)
                .hasFieldOrPropertyWithValue("type", Type.ANDROID)
                .hasFieldOrPropertyWithValue("sum", bigDecimal)
                .hasFieldOrPropertyWithValue("beginDate", date)
                .hasFieldOrPropertyWithValue("endDate", date)
                .hasFieldOrPropertyWithValue("textField", textField)
        ;
    }

}