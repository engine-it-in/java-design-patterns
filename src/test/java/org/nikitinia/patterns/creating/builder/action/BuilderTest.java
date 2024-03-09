package org.nikitinia.patterns.creating.builder.action;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.patterns.creating.builder.actor.OfficalDocument;

import static org.assertj.core.api.Assertions.assertThat;

class BuilderTest {
    private final OfficalDocument officalDocument =
            new OfficalDocument();

    private final Builder builder =
            Mockito.mock(
                    Builder.class,
                    Mockito.CALLS_REAL_METHODS
            );

    @Test
    void checkBuilder() {
        assertThat(builder)
                .hasFieldOrPropertyWithValue("officalDocument", null);
    }

    @Test
    void createOfficialDocument_shouldCreateDocument() {
        builder.createOfficialDocument();

        assertThat(builder.getOfficalDocument())
                .usingRecursiveComparison()
                .isEqualTo(officalDocument);

    }


}