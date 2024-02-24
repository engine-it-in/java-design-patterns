package org.nikitinia.patterns.structure.flyweight.action;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArchiveDocumentFactoryTest {

    private final ArchiveDocumentFactory archiveDocumentFactory = new ArchiveDocumentFactory();

    @Test
    void checkArchiveDocumentFactory() {
        assertThat(archiveDocumentFactory)
                .hasNoNullFieldsOrProperties();
    }

    @Test
    void getArchive_shouldReturnResult() {

    }

}