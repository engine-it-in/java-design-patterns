package org.nikitinia.patterns.creating.builder.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.creating.builder.action.Director;
import org.nikitinia.patterns.creating.builder.actor.CityDocument;
import org.nikitinia.patterns.creating.builder.actor.MinistryDocument;
import org.nikitinia.patterns.creating.builder.actor.OfficalDocument;
import org.nikitinia.util.InputValue;

public class Program {

    public static void main(String[] args) {

        Document document = DocumentCreator.documentBuildWithNumber(new InputValue().getDoubleValue());

        Director directorMinistryDocument = new Director(new MinistryDocument(document));
        OfficalDocument officalDocumentMinistry = directorMinistryDocument.documentBuilder();
        System.out.println(officalDocumentMinistry.toString());

        Director directorOfficialDocument = new Director(new CityDocument(document));
        OfficalDocument officalDocumentCity = directorOfficialDocument.documentBuilder();
        System.out.println(officalDocumentCity.toString());

    }

}
