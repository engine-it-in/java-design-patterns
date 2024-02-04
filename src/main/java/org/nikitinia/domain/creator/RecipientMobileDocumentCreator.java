package org.nikitinia.domain.creator;

import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

public class RecipientMobileDocumentCreator {

    public static RecipientMobileDocument RecipientMobileDocumentCreatorWithNameTypeMobile(String name, TypeMobile typeMobile) {
        return RecipientMobileDocument.builder()
                .name(name)
                .surname("surname")
                .patronymic("patronymic")
                .typeMobile(typeMobile)
                .build();
    }

}
