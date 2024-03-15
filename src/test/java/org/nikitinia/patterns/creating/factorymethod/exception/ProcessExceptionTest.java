package org.nikitinia.patterns.creating.factorymethod.exception;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProcessExceptionTest {

    private final ProcessException processException =
            new ProcessException("message");

    @Test
    void checkProcessException() {
        assertThat(processException)
                .isInstanceOf(RuntimeException.class)
                .hasFieldOrPropertyWithValue("message", processException.getMessage());
    }

}