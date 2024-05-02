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
public class MinistryDocument extends Builder {

    private final Document document;

    @Override
    public void buildName() {
        officalDocument.setName(MinistryDocument.class.getSimpleName() + " - " + "name");
    }

    @Override
    public void buildType() {
        officalDocument.setType(MinistryDocument.class.getSimpleName() + " - " + "type");

    }

    @Override
    public void buildSignatory() {
        officalDocument.setSignatory(MinistryDocument.class.getSimpleName() + " - " + "signatory");
    }

    @Override
    public void buildDocument() {
        officalDocument.setDocument(document);
    }
}
