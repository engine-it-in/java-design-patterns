package org.nikitinia.patterns.structure.facade.actor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import static org.assertj.core.api.Assertions.assertThat;

class MobileDocumentTest {

    Document document = DocumentCreator.documentBuildWithNumber(1.0);
    @ParameterizedTest
    @EnumSource(TypeMobile.class)
    void checkMobileDocument(TypeMobile typeMobile) {

        MobileDocument mobileDocument = new MobileDocument(document, typeMobile);

        assertThat(mobileDocument)
                .hasFieldOrPropertyWithValue("document", document)
                .hasFieldOrPropertyWithValue("typeMobile", typeMobile);
    }

}