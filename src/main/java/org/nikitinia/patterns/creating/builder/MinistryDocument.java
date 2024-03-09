package org.nikitinia.patterns.creating.builder;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.model.documents.Document;

@AllArgsConstructor
public class MinistryDocument extends Builder {

    private final Document document;

    @Override
    void buildName() {
        officalDocument.setName(MinistryDocument.class.getSimpleName() + " - " + "name");
    }

    @Override
    void buildType() {
        officalDocument.setType(MinistryDocument.class.getSimpleName() + " - " + "type");

    }

    @Override
    void buildSignatory() {
        officalDocument.setSignatory(MinistryDocument.class.getSimpleName() + " - " + "signatory");
    }

    @Override
    void buildDocument() {
        officalDocument.setDocument(document);
    }
}
