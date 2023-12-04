package org.nikitinia.patterns.behavior.iterator.logic;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentRepositoryTest {

    private final List<Document> documentList = DocumentCreator.getDocumentListFromThreeDocument();

    private final DocumentRepository documentRepository =
            new DocumentRepository(documentList);

    @Test
    void checkDocumentRepository() {
        assertThat(documentRepository)
                .hasFieldOrPropertyWithValue("documentIterator", documentRepository.getDocumentIterator());
    }

    @Test
    void getIterator_shouldReturnResult() {
        assertThat(documentRepository.getIterator())
                .usingRecursiveComparison()
                .isEqualTo(documentRepository.getDocumentIterator());
    }



}