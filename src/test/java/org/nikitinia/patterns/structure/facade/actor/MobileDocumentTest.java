package org.nikitinia.patterns.structure.facade.actor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nikitinia.patterns.structure.facade.util.TestBuilder.DOCUMENT;

class MobileDocumentTest {

    @ParameterizedTest
    @EnumSource(TypeMobile.class)
    void checkMobileDocument(TypeMobile typeMobile) {

        MobileDocument mobileDocument = new MobileDocument(DOCUMENT, typeMobile);

        assertThat(mobileDocument)
                .hasFieldOrPropertyWithValue("document", DOCUMENT)
                .hasFieldOrPropertyWithValue("typeMobile", typeMobile);
    }

}