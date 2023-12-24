package org.nikitinia.patterns.behavior.state.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;

class DocumentStateTest {

    private final DocumentState documentStateMock = Mockito.mock(
            DocumentState.class,
            Mockito.CALLS_REAL_METHODS
    );

    Document document =
            DocumentCreator.documentBuild();
    private final DocumentStart documentStart
            = new DocumentStart(document);

    private final ByteArrayOutputStream byteArrayOutputStream
            = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    void checkDocumentState() {
        assertThat(documentStateMock)
                .hasFieldOrProperty("document")
                .hasFieldOrProperty("registerDocuments");
    }

    @Test
    void initRegisterDocument_shouldReturnNull() {
        assertThat(documentStart.getRegisterDocuments())
                .isNull();
    }

    @Test
    void initRegisterDocument_shouldReturnNonNull() {
        documentStart.initRegisterDocument();
        assertThat(documentStart.getRegisterDocuments())
                .isEqualTo(new TreeSet<>());
    }

    @Test
    void checkRegisterDocuments_shouldReturnTrue() {
        documentStart.addDocument();

        assertThat(documentStart.checkRegisterDocuments(document))
                .isTrue();
    }

    @Test
    void checkRegisterDocuments_shouldReturnFalse() {
        Document documentNotExpected = DocumentCreator.documentBuildWithNumber(2.0);
        documentStart.addDocument();

        assertThat(documentStart.checkRegisterDocuments(documentNotExpected))
                .isFalse();
    }

    @Test
    void addDocument_shouldReturnNotAdd() {
        documentStart.addDocument();
        TreeSet<Document> registerDocumentsLocal = new TreeSet<>();
        registerDocumentsLocal.add(document);

        assertThat(documentStart.getRegisterDocuments())
                .usingRecursiveComparison()
                .isEqualTo(registerDocumentsLocal);
    }

    @Test
    void addDocument_shouldReturnAdd() {
        documentStart.addDocument();
        assertThat(documentStart.getRegisterDocuments().contains(document))
                .isTrue();
    }

    @Test
    void modifyStatus_shouldDo() {
        doAnswer(invocation -> {
            Object arg = invocation.getArgument(0);
            assertEquals(Status.DRAFT, arg);
            return null;
        }).when(documentStateMock).modifyDocumentStatus(any(Status.class));
        documentStateMock.modifyDocumentStatus(Status.DRAFT);
    }

    @Test
    void notifyDocumentStatus_shouldDo() {
        documentStart.notifyDocumentStatus();

        assertThat(byteArrayOutputStream.toString().trim())
                .isEqualTo("Document " + document.getNumber() + " have Status " + document.getStatus());
    }

    @Test
    void printRegisterDocumentsHistory_shouldDo() {
        documentStart.addDocument();
        documentStart.printRegisterDocumentsHistory();

        assertThat(byteArrayOutputStream.toString().trim())
                .isEqualTo(
                        "Register document contains document number " +
                                document.getNumber() +
                                " and status " +
                                document.getStatus());
    }


}