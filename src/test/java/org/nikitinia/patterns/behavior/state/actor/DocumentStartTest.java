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

class DocumentStartTest {

    private final Document document =
            DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.SIGN);

    private final DocumentStart documentStart
            = new DocumentStart(document);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void documentStart_check() {
        assertThat(documentStart)
                .hasFieldOrPropertyWithValue("document", null)
                .isInstanceOf(DocumentState.class);
    }

    @Test
    void doAction_shouldDo() {

        documentStart.doAction();

        assertThat(documentStart)
                .isInstanceOfSatisfying(DocumentStart.class, documentStartData -> {

                    assertThat(documentStartData.registerDocuments)
                            .contains(document)
                            .isInstanceOf(TreeSet.class);

                    assertThat(documentStartData.checkRegisterDocuments(document))
                            .isTrue();

                    assertThat(document.getStatus())
                            .isEqualTo(Status.PRESIGN);

                    assertThat(outputStream.toString().trim())
                            .isEqualTo("Document " + document.getNumber() + " have Status " + document.getStatus());

                });

    }


}