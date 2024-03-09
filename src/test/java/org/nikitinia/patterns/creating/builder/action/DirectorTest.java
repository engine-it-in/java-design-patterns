package org.nikitinia.patterns.creating.builder.action;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.patterns.creating.builder.actor.OfficalDocument;

import static org.assertj.core.api.Assertions.assertThat;

class DirectorTest {

    private final Builder builder =
            Mockito.mock(
                    Builder.class,
                    Mockito.CALLS_REAL_METHODS
            );

    private final Director director =
            new Director(builder);

    @Test
    void checkDirector() {
        assertThat(director)
                .hasFieldOrPropertyWithValue("builder", builder);
    }

    @Test
    void documentBuilder_shouldCreateDocument() {
        assertThat(director.documentBuilder())
                .usingRecursiveComparison()
                .isEqualTo(new OfficalDocument());
    }

}