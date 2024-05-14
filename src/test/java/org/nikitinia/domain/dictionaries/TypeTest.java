package org.nikitinia.domain.dictionaries;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class TypeTest {

    @ParameterizedTest
    @EnumSource(Type.class)
    void checkType(Type type) {
        assertThat(type)
                .isEqualTo(Type.valueOf(type.name()));
    }

}