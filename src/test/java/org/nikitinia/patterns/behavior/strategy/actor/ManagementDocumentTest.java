package org.nikitinia.patterns.behavior.strategy.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.strategy.exception.FindException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ManagementDocumentTest {

    private final ManagementDocument managementDocument
            = new ManagementDocument();

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    List<Document> documentList = List.of(
            DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.PRESIGN),
            DocumentCreator.documentBuildWithNumberAndStatus(2.0, Status.DRAFT),
            DocumentCreator.documentBuildWithNumberAndStatus(3.0, Status.SIGN)
    );

    List<Document> documentListWithOutDraftElement = List.of(
            DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.PRESIGN)
    );

    @Test
    void findDocument_shouldReturnResult() {
        managementDocument.findDocument(documentList);

        assertThat(outputStream.toString().trim())
                .isEqualTo("2.0");
    }

    @Test
    void findDocument_shouldThrownException() {
        assertThatThrownBy(() -> managementDocument.findDocument(documentListWithOutDraftElement))
                .usingRecursiveComparison()
                .isEqualTo(new FindException());
    }

}