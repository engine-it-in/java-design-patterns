package org.nikitinia.domain.model.documents;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.dictionaries.Type;
import org.nikitinia.domain.model.additional.TextField;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentTest {

    private final static Double one = 1.0;
    private final static String TEST_STRING = "string";
    private final static TextField textField = new TextField();

    private final Document document =
            Document.builder()
                    .number(one)
                    .signatory(TEST_STRING)
                    .status(Status.SIGN)
                    .type(Type.ANDROID)
                    .textField(textField)
                    .build();

    private final Document documentZero =
            Document.builder()
                    .number(0.0)
                    .build();

    @Test
    void checkDocument() {
        assertThat(document)
                .isInstanceOf(Comparable.class)
                .hasFieldOrPropertyWithValue("number", one)
                .hasFieldOrPropertyWithValue("signatory", TEST_STRING)
                .hasFieldOrPropertyWithValue("status", Status.SIGN)
                .hasFieldOrPropertyWithValue("type", Type.ANDROID)
                .hasFieldOrPropertyWithValue("textField", textField)
        ;
    }

    @Test
    void checkDocumentToString() {
        assertThat(document.toString())
                .contains("Document{")
                .contains("number='")
                .contains(String.valueOf(one))
                .contains(", status='")
                .contains(String.valueOf(Status.SIGN))
                .contains(", type='")
                .contains(String.valueOf(Type.ANDROID))
                .contains(", signatory='")
                .contains(TEST_STRING)
                .contains(", textField=")
                .contains(textField.toString())
                .contains("}")
        ;
    }

    @Test
    void checkDocumentCompareTo() {
        assertThat(document.compareTo(documentZero))
                .isEqualTo(1);
    }


}