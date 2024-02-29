package org.nikitinia.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

import static org.assertj.core.api.Assertions.assertThat;

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
        provideInput(1.0);
        inputValue.getDoubleValue();
    }

    void provideInput(Double doubleValue) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(ByteBuffer.allocate(8).putDouble(doubleValue).array());
        System.setIn(inputStream);
    }

}