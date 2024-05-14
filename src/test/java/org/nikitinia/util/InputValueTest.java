package org.nikitinia.util;

import org.junit.jupiter.api.Test;
import org.nikitinia.exception.BusinessException;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValueTest {

    private final InputValue inputValue
            = new InputValue();


    @Test
    void checkInputValue() {
        assertThat(inputValue)
                .hasNoNullFieldsOrProperties();
    }

    @Test
    void getDoubleValue_shouldReturnResult() {
        provideInput("1.0");
        assertThat(inputValue.getDoubleValue())
                .isEqualTo(1.0);
    }

    @Test
    void getDoubleValue_shouldReturnResultAfterThreeIterations() {
        provideInput("!");
        provideInput("a");
        provideInput("1.0");
        assertThat(inputValue.getDoubleValue())
                .isEqualTo(1.0);
    }

    @Test
    void getDoubleValue_shouldThrownException() {
        provideInput("!");
        provideInput("a");
        provideInput("!");
        assertThatThrownBy(inputValue::getDoubleValue)
                .isInstanceOf(BusinessException.class)
                .hasMessageContaining("Input value is not a double");
    }

    void provideInput(String doubleValue) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(doubleValue.getBytes());
        System.setIn(inputStream);
    }

}