package org.nikitinia.patterns.structure.adapter.actor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class DocumentRepositoryTest {

    private final DocumentRepository documentRepository
            = new DocumentRepository();

    private final Document document
            = DocumentCreator.documentBuildWithNumber(1.0);

    private final ByteArrayOutputStream outputStream
            = new ByteArrayOutputStream();

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

}