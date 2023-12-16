package org.nikitinia.patterns.behavior.memento.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;

class DocumentEditorTest {

    DocumentEditor documentEditor =
            new DocumentEditor();

    Document document =
            DocumentCreator.documentBuildWithNumber(1.0);

    ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }


    @Test
    void checkDocumentEditor() {
        assertThat(documentEditor)
                .hasFieldOrPropertyWithValue("document", null);
    }

    @Test
    void memento_shouldReturnResult() {
        documentEditor.setDocument(document);
        Memento memento = documentEditor.memento();

        assertEquals(
                document.toString(),
                outputStream.toString().trim()
        );

        assertThat(memento)
                .isInstanceOf(Memento.class);
    }

    @Test
    void memento_checkLoad() {

        DocumentEditor documentEditorMock =
                Mockito.mock(DocumentEditor.class, Mockito.CALLS_REAL_METHODS);

        Memento memento = new Memento(document);

        doAnswer(invocation -> {
                    Object arg = invocation.getArgument(0);
                    assertEquals(memento, arg);
                    return null;
                }
        ).when(documentEditorMock).load(any(Memento.class));

        documentEditorMock.load(memento);
    }

}