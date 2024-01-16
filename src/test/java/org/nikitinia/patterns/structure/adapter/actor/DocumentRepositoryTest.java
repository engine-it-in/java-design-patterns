package org.nikitinia.patterns.structure.adapter.actor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;

@Slf4j
@ExtendWith(MockitoExtension.class)
class DocumentRepositoryTest {

    private final DocumentRepository documentRepository
            = new DocumentRepository();

    private final Document document
            = DocumentCreator.documentBuildWithNumber(1.0);

    private final ByteArrayOutputStream outputStream
            = new ByteArrayOutputStream();

    @Mock
    private DocumentRepository documentRepositoryMock;

    @BeforeEach
    void setUp() {

        System.setOut(new PrintStream(outputStream));
    }


    @Test
    void checkDocumentRepository() {
        assertThat(documentRepository)
                .hasFieldOrPropertyWithValue("documentMap", new HashMap<>());
    }

    @Test
    void save_shouldDo() {
        documentRepository.save(document);

        assertThat(outputStream.toString())
                .contains("Save");

        assertThat(documentRepository.getDocumentMap().get(document.getNumber()))
                .usingRecursiveComparison()
                .isEqualTo(document);
    }

    @Test
    void load_shouldReturnResult() {

        documentRepository.save(document);

        assertThat(documentRepository.load(document.getNumber()))
                .usingRecursiveComparison()
                .isEqualTo(document);

        assertThat(outputStream.toString())
                .contains("Load");

        assertThat(documentRepository.getDocumentMap())
                .hasSize(1);
    }

    @Test
    void delete_shouldDo() {
        doAnswer(invocation -> {
            Document arg = invocation.getArgument(0);
            assertEquals(document, arg);
            return null;
        }).when(documentRepositoryMock).delete(any(Document.class));

        documentRepositoryMock.delete(document);
    }

    @Test
    void delete_shouldLogAndDelete() {
        documentRepository.save(document);
        documentRepository.delete(document);

        assertThat(outputStream.toString())
                .contains("Delete");

        assertThat(documentRepository.getDocumentMap())
                .hasSize(0);
    }

}