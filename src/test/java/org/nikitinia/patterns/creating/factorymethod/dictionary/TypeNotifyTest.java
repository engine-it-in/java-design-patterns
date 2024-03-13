package org.nikitinia.patterns.creating.factorymethod.dictionary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TypeNotifyTest {

    @Test
    void checkTypeNotify() {
        assertThat(TypeNotify.values())
                .containsExactly(
                        TypeNotify.MEDIA,
                        TypeNotify.OFFICIAL,
                        TypeNotify.OTHER);
    }

}