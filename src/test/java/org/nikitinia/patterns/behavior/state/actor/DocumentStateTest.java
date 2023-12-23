package org.nikitinia.patterns.behavior.state.actor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentStateTest {

    private final DocumentState documentStateMock = Mockito.mock(
            DocumentState.class,
            Mockito.CALLS_REAL_METHODS
    );

    public TreeSet<Document> registerDocuments =
            new TreeSet<>();

    Document document =
            DocumentCreator.documentBuild();
    private final DocumentStart documentStart
            = new DocumentStart(document);

    @Test
    void checkDocumentState() {
        assertThat(documentStateMock)
                .hasFieldOrProperty("document")
                .hasFieldOrProperty("registerDocuments");
    }

    @Test
    void initRegisterDocument_shouldReturnNull() {
        assertThat(documentStart.initRegisterDocument(registerDocuments))
                .isEqualTo(registerDocuments);
    }

    @Test
    void initRegisterDocument_shouldReturnNonNull() {
        documentStart.addDocument();
        assertThat(documentStart.initRegisterDocument(registerDocuments))
                .isNotNull();
    }

    @Test
    void checkRegisterDocuments_shouldReturnFalse() {
        documentStart.addDocument();

        assertThat(documentStart.checkRegisterDocuments(document))
                .isFalse();
    }

    @Test
    void checkRegisterDocuments_shouldReturnTrue() {
        assertThat(documentStart.checkRegisterDocuments(document))
                .isTrue();
    }


}