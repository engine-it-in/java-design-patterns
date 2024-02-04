package org.nikitinia.patterns.structure.facade.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.RecipientMobileDocumentCreator;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecipientMobileDocumentTest {

    private final RecipientMobileDocument recipientMobileDocument =
            RecipientMobileDocumentCreator.RecipientMobileDocumentCreatorWithNameTypeMobile("name", TypeMobile.WINDOWS);

    @Test
    void checkRecipientMobileDocument() {
        assertThat(recipientMobileDocument)
                .hasFieldOrPropertyWithValue("name", recipientMobileDocument.name())
                .hasFieldOrPropertyWithValue("surname", recipientMobileDocument.surname())
                .hasFieldOrPropertyWithValue("patronymic", recipientMobileDocument.patronymic())
                .hasFieldOrPropertyWithValue("typeMobile", recipientMobileDocument.typeMobile());
    }

    @Test
    void recipientMobileDocument_shouldHaveToString() {
        assertThat(recipientMobileDocument.toString())
                .contains(recipientMobileDocument.name())
                .contains(recipientMobileDocument.surname())
                .contains(recipientMobileDocument.patronymic())
                .contains(recipientMobileDocument.typeMobile().toString());
    }


}