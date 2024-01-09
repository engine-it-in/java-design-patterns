package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

class DocumentWorkerTest {

    private final DocumentWorker documentWorker
            = new DocumentWorker();

    private final Document document
            = DocumentCreator.documentBuild();

    @Test
    void check_DocumentWorker() {
        assertThat(documentWorker)
                .hasFieldOrPropertyWithValue(
                        "commandHistory",
                        documentWorker.getCommandHistory()
                );
    }

    @Test
    void start_ShouldResult() {
        documentWorker.start(document);

        assertThat(documentWorker.getCommandHistory())
                .usingRecursiveComparison()
                .isEqualTo(new CommandHistory());

    }

}