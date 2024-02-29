package org.nikitinia.exception;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BusinessExceptionTest {

    private final BusinessException businessException =
            new BusinessException("message");

    @Test
    void checkBusinessException() {
        assertThat(businessException)
                .isInstanceOf(RuntimeException.class)
                .hasFieldOrPropertyWithValue("message", businessException.getMessage());
    }

}