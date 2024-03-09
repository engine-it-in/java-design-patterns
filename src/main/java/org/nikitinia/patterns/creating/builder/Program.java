package org.nikitinia.patterns.creating.builder;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.util.InputValue;

public class Program {

    public static void main(String[] args) {

        Document document = DocumentCreator.documentBuildWithNumber(new InputValue().getDoubleValue());

        Director directorMinistryDocument = new Director(new MinistryDocument(document));
        OfficalDocument officalDocumentFirstType = directorMinistryDocument.houseBuilder();
        System.out.println(officalDocumentFirstType.toString());

        Director directorOfficialDocument = new Director(new CityDocument(document));
        OfficalDocument officalDocumentSecondType = directorOfficialDocument.houseBuilder();
        System.out.println(officalDocumentSecondType.toString());

    }

}
