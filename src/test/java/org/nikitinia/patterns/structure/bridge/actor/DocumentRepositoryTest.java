package org.nikitinia.patterns.structure.bridge.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentRepositoryTest {

    private final DocumentRepository documentRepository
            = new DocumentRepository();

    private final Document document
            = DocumentCreator.documentBuildWithNumber(1.0);

    @Test
    void checkDocumentRepository() {
        assertThat(documentRepository)
                .hasFieldOrPropertyWithValue("documentMap", new HashMap<>());
    }

    @Test
    void putDocument_shouldDo() {
        documentRepository.putDocument(document);

        assertThat(documentRepository.getDocumentMap())
                .containsEntry(document.getNumber(), document);

    }

    @Test
    void getDocument_shouldDo() {
        documentRepository.putDocument(document);

        assertThat(documentRepository.getDocument(document.getNumber()))
                .usingRecursiveComparison()
                .isEqualTo(document);
    }

}