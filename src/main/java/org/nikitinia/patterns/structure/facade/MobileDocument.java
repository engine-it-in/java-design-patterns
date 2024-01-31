package org.nikitinia.patterns.structure.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;

@AllArgsConstructor
@Getter
@Slf4j
public record MobileDocument(Document document, TypeMobile typeMobile) {

    public MobileDocument prepareDocument() {
        log.info("mobile document with type {} prepare for work", this.typeMobile);
        return this;
    }

}
