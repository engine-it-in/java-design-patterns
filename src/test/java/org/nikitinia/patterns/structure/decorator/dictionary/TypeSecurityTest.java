package org.nikitinia.patterns.structure.decorator.dictionary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TypeSecurityTest {

    @Test
    void checkTypeSecurity() {
        assertThat(TypeSecurity.class)
                .hasDeclaredFields("value");
    }

    @ParameterizedTest
    @MethodSource("provideEnumTestData")
    void checkTypeSecurityValue(String enumData, String value) {
        assertThat(enumData)
                .isEqualTo(value);
    }

    private static Stream<Arguments> provideEnumTestData() {
        return Stream.of(
                Arguments.of(TypeSecurity.ENCRYPT.getValue(), "encrypt"),
                Arguments.of(TypeSecurity.DECRYPT.getValue(), "decrypt")
        );
    }


}