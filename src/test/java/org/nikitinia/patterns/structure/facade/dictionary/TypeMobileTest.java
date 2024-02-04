package org.nikitinia.patterns.structure.facade.dictionary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class TypeMobileTest {

    @ParameterizedTest
    @EnumSource(TypeMobile.class)
    void checkTypeMobile(TypeMobile typeMobile) {
        assertThat(typeMobile)
                .isIn(TypeMobile.values());
    }

    @Test
    void randomType_shouldDo() {
        assertThat(TypeMobile.randomType())
                .isIn(TypeMobile.values());
    }

}