package org.nikitinia.patterns.creating.builder.actor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OfficalDocumentTest {

    private final OfficalDocument officalDocument =
            new OfficalDocument();

    @Test
    void checkOfficialDocument() {
        assertThat(officalDocument)
                .hasFieldOrPropertyWithValue("name", null)
                .hasFieldOrPropertyWithValue("type", null)
                .hasFieldOrPropertyWithValue("signatory", null)
                .hasFieldOrPropertyWithValue("document", null)
        ;
    }

    @Test
    void toString_shouldReturnValue() {
        assertThat(officalDocument.toString())
                .isEqualTo(
                        """
                                OfficalDocument{
                                name= null
                                , type=null
                                , signatory=null
                                , document=null
                                }"""
                );
    }

}