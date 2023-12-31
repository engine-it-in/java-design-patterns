package org.nikitinia.patterns.behavior.strategy.exception;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindExceptionTest {

    FindException findException =
            new FindException();

    @Test
    void checkFindException() {
        assertThat(findException)
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Do not find that exactly need");
    }

}