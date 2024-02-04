package org.nikitinia.patterns.structure.facade.exception;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FacadeProcessingExceptionTest {

    private final FacadeProcessingException facadeProcessingException =
            new FacadeProcessingException();

    @Test
    void checkFacadeProcessingException() {
        assertThat(facadeProcessingException)
                .isInstanceOf(RuntimeException.class)
                .hasFieldOrPropertyWithValue("message", facadeProcessingException.getMessage());
    }

}