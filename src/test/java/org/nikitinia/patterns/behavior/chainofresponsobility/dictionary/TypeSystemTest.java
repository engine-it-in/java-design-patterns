package org.nikitinia.patterns.behavior.chainofresponsobility.dictionary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class TypeSystemTest {

    @ParameterizedTest
    @EnumSource(TypeSystem.class)
    void checkTypeSystem(TypeSystem typeSystem) {

        String system = typeSystem.system;

        assertThat(system)
                .containsAnyOf(
                        TypeSystem.TELEGRAM.getSystem(),
                        TypeSystem.SMS.getSystem(),
                        TypeSystem.EMAIL.getSystem()
                        );
    }

}