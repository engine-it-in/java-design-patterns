package org.nikitinia.domain.model.additional;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextFieldTest {

    private final int one = 1;

    private final String TEST_STRING = "string";

    private final TextField textField =
            new TextField(one, one, one, TEST_STRING, TEST_STRING);

    @Test
    void checkTextFieldNoArgsConstructor() {
        assertThat(new TextField())
                .hasFieldOrPropertyWithValue("line", 0)
                .hasFieldOrPropertyWithValue("column", 0)
                .hasFieldOrPropertyWithValue("quantitySymbolLine", 0)
                .hasFieldOrPropertyWithValue("text", null)
                .hasFieldOrPropertyWithValue("buffer", null)
        ;
    }

    @Test
    void checkTextFieldAllArgsConstructor() {
        assertThat(textField)
                .hasFieldOrPropertyWithValue("line", one)
                .hasFieldOrPropertyWithValue("column", one)
                .hasFieldOrPropertyWithValue("quantitySymbolLine", one)
                .hasFieldOrPropertyWithValue("text", TEST_STRING)
                .hasFieldOrPropertyWithValue("buffer", TEST_STRING)
        ;
    }

    @Test
    void checkToStringReturnResult() {
        assertThat(textField.toString())
                .contains("TextField{")
                .contains("line=")
                .contains(String.valueOf(one))
                .contains(", column=")
                .contains(String.valueOf(one))
                .contains(", quantitySymbolLine=")
                .contains(String.valueOf(one))
                .contains(", text='")
                .contains(TEST_STRING)
                .contains(", buffer='")
                .contains(TEST_STRING)
                .contains("}")
        ;
    }

}