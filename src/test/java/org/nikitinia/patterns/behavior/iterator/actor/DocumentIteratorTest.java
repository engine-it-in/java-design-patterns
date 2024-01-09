package org.nikitinia.patterns.behavior.iterator.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DocumentIteratorTest {

    List<Document> documentList = DocumentCreator.getDocumentListFromThreeDocument();

    private final DocumentIterator documentIterator = new DocumentIterator(documentList);

    private ByteArrayOutputStream outputStreamCaptor =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @Test
    void checkDocumentIterator() {
        assertThat(documentIterator)
                .hasFieldOrPropertyWithValue("position", 0)
                .hasFieldOrPropertyWithValue("documentList", documentList);
    }

    @Test
    void hasNext_shouldReturnResult() {
        assertThat(documentIterator.hasNext())
                .isEqualTo(documentIterator.getPosition() < documentIterator.getDocumentList().size());
    }

    @Test
    void next_shouldReturnResult() {

        int position = documentIterator.getPosition();

        assertThat(documentIterator.next())
                .isEqualTo(documentList.get(position));
    }

    @Test
    void next_shouldIncrenmentPosition() {

        int position = documentIterator.getPosition();
        int positionCaptor = position;

        documentIterator.next();

        assertThat(position)
                .isEqualTo(positionCaptor++);
    }

    @Test
    void next_shouldSystemOutPrintln() {

        int position = documentIterator.getPosition();

        documentIterator.next();

        assertEquals(
                documentList.get(position).toString(),
                outputStreamCaptor.toString().trim()
        );

    }

}