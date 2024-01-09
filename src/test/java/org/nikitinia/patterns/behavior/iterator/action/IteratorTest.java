package org.nikitinia.patterns.behavior.iterator.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.actor.DocumentIterator;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class IteratorTest {

    private final List<Document> documentList =
            DocumentCreator.getDocumentListFromThreeDocument();

    private final Iterator<Document> iterator
            = new DocumentIterator(documentList);

    @Test
    void hasNext_shouldReturnResult() {
        assertThat(iterator.hasNext())
                .isInstanceOf(Boolean.class);
    }

    @Test
    void next_shouldReturnResult() {
        assertThat(iterator.next())
                .isInstanceOf(Document.class);
    }

}