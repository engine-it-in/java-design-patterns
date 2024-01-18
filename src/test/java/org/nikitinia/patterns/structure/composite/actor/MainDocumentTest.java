package org.nikitinia.patterns.structure.composite.actor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class MainDocumentTest {

    @Test
    void checkMainDocument() {
        MainDocument mainDocument = Mockito.mock(
                MainDocument.class,
                Mockito.CALLS_REAL_METHODS
        );

        assertThat(mainDocument).
                hasFieldOrPropertyWithValue("document", null);
    }

}