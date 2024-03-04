package org.nikitinia.patterns.structure.bridge.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Type;
import org.nikitinia.patterns.structure.bridge.action.AndroidInterfaze;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class WebDocumentTest {

    private final DocumentRepository documentRepository
            = new DocumentRepository();

    private final AndroidInterfaze androidInterfaze
            = new AndroidInterfaze(documentRepository);

    private final WebDocument webDocument
            = new WebDocument(androidInterfaze);

    private final org.nikitinia.domain.model.documents.Document document
            = DocumentCreator.documentBuildWithNumber(1.0);

    private final ByteArrayOutputStream byteArrayOutputStream
            = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    void checkMobileDocument() {
        assertThat(webDocument)
                .isInstanceOf(DocumentAbstract.class)
                .hasFieldOrPropertyWithValue("interfaze", androidInterfaze);
    }

    @Test
    void createDocument_shouldDo() {

        documentRepository.putDocument(document);

        webDocument.createDocument(document);

        document.setType(Type.ANDROID);
        assertThat(byteArrayOutputStream.toString().trim())
                .contains("create web document")
                .contains("Android. Load  document")
                .contains(document.toString());
    }

}