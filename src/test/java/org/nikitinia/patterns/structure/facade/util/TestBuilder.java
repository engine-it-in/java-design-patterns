package org.nikitinia.patterns.structure.facade.util;

import lombok.experimental.UtilityClass;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@UtilityClass
public class TestBuilder {

    public static final Document DOCUMENT =
            DocumentCreator.documentBuildWithNumber(1.0);

    public static final List<MobileDocument> MOBILE_DOCUMENT_LIST
            = new ArrayList<>();

    public static final HashMap<Integer, RecipientMobileDocument> RECIPIENT_MOBILE_DOCUMENT_HASH_MAP =
            new HashMap<>();

    public static RecipientMobileDocument RECIPIENT_MOBILE_DOCUMENT =
            RecipientMobileDocument.builder()
                    .name("Иван")
                    .surname("Иванов")
                    .patronymic("Иванович")
                    .typeMobile(TypeMobile.ANDROID).build();

}
