package org.nikitinia.patterns.structure.facade.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

@Slf4j
public record MobileDocument(
        Document document,
        TypeMobile typeMobile) {
}
