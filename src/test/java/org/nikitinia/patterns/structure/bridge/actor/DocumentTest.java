package org.nikitinia.patterns.structure.bridge.actor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentTest {

    @Test
    void checkDocument() {
        Document document = Mockito.mock(
                Document.class,
                Mockito.CALLS_REAL_METHODS
        );

        assertThat(document)
                .hasFieldOrProperty("interfaze");
    }

}