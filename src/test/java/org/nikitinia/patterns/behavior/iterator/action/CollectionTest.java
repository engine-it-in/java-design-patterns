package org.nikitinia.patterns.behavior.iterator.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.logic.DocumentRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionTest {

    private final List<Document> documentList =
            DocumentCreator.getDocumentListFromThreeDocument();

    private final Collection collection =
            new DocumentRepository(documentList);

    @Test
    void getIterator_shouldReturnResult() {
        assertThat(collection.getIterator())
                .isInstanceOf(Iterator.class);
    }

}