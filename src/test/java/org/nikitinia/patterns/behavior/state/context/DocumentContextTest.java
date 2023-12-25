package org.nikitinia.patterns.behavior.state.context;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;
import org.nikitinia.patterns.behavior.state.actor.DocumentStart;
import org.nikitinia.patterns.behavior.state.actor.DocumentStop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeSet;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentContextTest {

    private static final Document document =
            DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.DRAFT);
    private final DocumentContext documentContext =
            new DocumentContext(document);

    private static final DocumentStart documentStart =
            new DocumentStart(document);

    private static final DocumentStop documentStop =
            new DocumentStop(document);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }


    @Test
    void documentContext_check() {
        assertThat(documentContext)
                .hasFieldOrPropertyWithValue("document", document)
                .hasFieldOrProperty("documentActivity");
    }

    @Test
    void doAction_shouldDo() {

        documentContext.setDocumentActivity(documentStart);

        documentContext.doAction();

        assertThat(documentContext.documentActivity)
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

    @ParameterizedTest
    @MethodSource("provideDocumentStartStopClass")
    void changeAction_shouldDo(DocumentActivity first, DocumentActivity second) {

        documentContext.setDocumentActivity(first);

        documentContext.changeAction();

        assertThat(documentContext.documentActivity)
                .usingRecursiveComparison()
                .isEqualTo(second);
    }

    private static Stream<Arguments> provideDocumentStartStopClass() {
        return Stream.of(
          Arguments.of(documentStart, documentStop),
          Arguments.of(documentStop, documentStart)
        );
    }

}