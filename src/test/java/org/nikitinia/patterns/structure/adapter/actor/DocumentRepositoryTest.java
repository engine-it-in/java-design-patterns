package org.nikitinia.patterns.structure.adapter.actor;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.read.ListAppender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentRepositoryTest {

    private final DocumentRepository documentRepository
            = new DocumentRepository();

    private final Document document = DocumentCreator.documentBuildWithNumber(1.0);

    private Logger logger = (Logger) LoggerFactory.getLogger(DocumentRepository.class);

    @BeforeEach
    void setUp() {
        Appender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
    }

    @Test
    void checkDocumentRepository() {
        assertThat(documentRepository)
                .hasFieldOrPropertyWithValue("documentMap", new HashMap<>());
    }

    @Test
    void save_shouldDo() {
        documentRepository.save(document);



    }

}