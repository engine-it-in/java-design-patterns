package org.nikitinia.domain.dictionaries;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class StatusTest {

    @ParameterizedTest
    @EnumSource(Status.class)
    void checkStatus(Status status) {
        assertThat(status)
                .isEqualTo(Status.valueOf(status.name()));
    }

}