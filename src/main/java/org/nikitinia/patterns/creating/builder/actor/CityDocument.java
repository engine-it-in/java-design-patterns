package org.nikitinia.patterns.creating.builder.actor;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.creating.builder.action.Builder;

/**
 * Что -> ?
 * Для чего -> ?
 * Реализация -> ?
 * Ценность -> ?
 */
@AllArgsConstructor
public class CityDocument extends Builder {

    private final Document document;

    @Override
    public void buildName() {
        officalDocument.setName(CityDocument.class.getSimpleName() + " : " + "name");
    }

    @Override
    public void buildType() {
        officalDocument.setType(CityDocument.class.getSimpleName() + " : " + "type");
    }

    @Override
    public void buildSignatory() {
        officalDocument.setSignatory(CityDocument.class.getSimpleName() + " : " + "signatory");
    }

    @Override
    public void buildDocument() {
        officalDocument.setDocument(document);
    }
}