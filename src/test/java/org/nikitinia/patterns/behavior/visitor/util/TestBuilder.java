package org.nikitinia.patterns.behavior.visitor.util;

import lombok.experimental.UtilityClass;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;
import org.nikitinia.patterns.behavior.visitor.action.Converter;

import static org.nikitinia.patterns.behavior.visitor.util.TestData.TEST_ID;

@UtilityClass
public class TestBuilder {

    public static Document testDocument
            = DocumentCreator.documentBuildWithNumber(1.0);

    public static FinanceDocument testFinanceDocument
            = new FinanceDocument(TEST_ID, testDocument);
    public static ManagementDocument testManagementDocument
            = new ManagementDocument(TEST_ID, testDocument);
    public static PayDocument testPayDocument
            = new PayDocument(TEST_ID, testDocument);

    public static Converter testConverter
            = new Converter();

}
