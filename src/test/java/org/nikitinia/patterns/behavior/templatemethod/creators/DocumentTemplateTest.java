package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.AgreementCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.templatemethod.action.Creator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentTemplateTest {

    private final DocumentTemplate documentTemplate = Mockito.mock(
            DocumentTemplate.class,
            Mockito.CALLS_REAL_METHODS
    );

    private final Agreement agreement =
            AgreementCreator.agreementBuildWithNumberAndStatus(1.0, Status.DRAFT);

    private final Agreement agreementWithSignatory =
            AgreementCreator.agreementBuildWithNumberAndSignatoryAndStatus(1.0, "Agreement", Status.DRAFT);

    private final AgreementTemplate agreementTemplate =
            new AgreementTemplate(agreement);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    private final Map<Double, Document> documentDictionary =
            Map.of(
                    1.0, agreementWithSignatory
            );

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkDocumentTemplate() {
        assertThat(documentTemplate)
                .hasFieldOrPropertyWithValue("document", null)
                .hasFieldOrPropertyWithValue("documentDictionary", null)
                .isInstanceOf(Creator.class)
                .isInstanceOf(DocumentTemplate.class);
    }

    @Test
    void createDocument_shouldModifyDocument() {

        agreement.setSignatory("Agreement");

        assertThat(agreementTemplate.createDocument())
                .usingRecursiveComparison()
                .isEqualTo(agreement);

    }

    @Test
    void createDocument_shouldVisualizeDocument() {

        agreementTemplate.createDocument();

        assertThat(outputStream.toString().trim())
                .isEqualTo("Number is 1.0, Signatory is Agreement, Status is DRAFT");

    }

    @Test
    void createDocument_shouldCreateDocumentDictionary() {

        agreementTemplate.createDocument();

        assertThat(agreementTemplate.getDocumentDictionary())
                .isEqualTo(agreementTemplate.addLink(agreement));

    }

    @Test
    void visualizeDocument_shouldReturnResult() {

        agreementTemplate.visualizeDocument(documentDictionary);

        assertThat(outputStream.toString().trim())
                .isEqualTo("Number is 1.0, Signatory is Agreement, Status is DRAFT");

    }


}