package org.nikitinia.patterns.behavior.state.actor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentStateTest {

    private final DocumentState documentState = Mockito.mock(
            DocumentState.class,
            Mockito.CALLS_REAL_METHODS
    );

    @Test
    void checkDocumentState() {
        assertThat(documentState)
                .hasFieldOrProperty("document")
                .hasFieldOrProperty("registerDocuments");
    }


}