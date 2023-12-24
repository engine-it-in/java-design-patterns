package org.nikitinia.patterns.behavior.state.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DocumentStopTest {

    private final Document document =
            DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.DRAFT);

    private final DocumentStop documentStop =
            new DocumentStop(document);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void documentStop_check() {
        assertThat(documentStop)
                .hasFieldOrPropertyWithValue("document", null)
                .isInstanceOf(DocumentState.class);
    }


    @Test
    void doAction_shouldReturnResult() {
        documentStop.doAction();

        assertThat(documentStop)
                .isInstanceOfSatisfying(DocumentStop.class, documentStopData -> {

                    assertThat(documentStopData.registerDocuments)
                            .contains(document)
                            .isInstanceOf(TreeSet.class);

                    assertThat(documentStopData.checkRegisterDocuments(document))
                            .isTrue();

                    assertThat(document.getStatus())
                            .isEqualTo(Status.SIGN);

                    assertThat(outputStream.toString().trim())
                            .isEqualTo("Document " + document.getNumber() + " have Status " + document.getStatus());

                });

    }
}