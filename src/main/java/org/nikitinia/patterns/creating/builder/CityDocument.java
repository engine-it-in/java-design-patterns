package org.nikitinia.patterns.creating.builder;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.model.documents.Document;

@AllArgsConstructor
public class CityDocument extends Builder {

    private final Document document;

    @Override
    void buildName() {
        officalDocument.setName(CityDocument.class.getSimpleName() + " : " + "name");
    }

    @Override
    void buildType() {
        officalDocument.setType(CityDocument.class.getSimpleName() + " : " + "type");
    }

    @Override
    void buildSignatory() {
        officalDocument.setSignatory(CityDocument.class.getSimpleName() + " : " + "signatory");
    }

    @Override
    void buildDocument() {
        officalDocument.setDocument(document);
    }
}