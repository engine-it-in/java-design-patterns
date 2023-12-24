package org.nikitinia.patterns.behavior.state.context;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class DocumentContextTest {

    private final Document document =
            DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.DRAFT);
    private final DocumentContext documentContext =
            new DocumentContext(document);

    @Test
    void documentContext_check() {
        assertThat(documentContext)
                .hasFieldOrPropertyWithValue("document", document)
                .hasFieldOrProperty("documentActivity");
    }

}