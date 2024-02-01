package org.nikitinia.patterns.structure.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;

@Slf4j
public record MobileDocument(
        Document document,
        TypeMobile typeMobile) {
}
