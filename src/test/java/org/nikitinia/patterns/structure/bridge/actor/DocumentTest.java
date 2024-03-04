package org.nikitinia.patterns.structure.bridge.actor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentTest {

    @Test
    void checkDocument() {
        DocumentAbstract document = Mockito.mock(
                DocumentAbstract.class,
                Mockito.CALLS_REAL_METHODS
        );

        assertThat(document)
                .hasFieldOrProperty("interfaze");
    }

}