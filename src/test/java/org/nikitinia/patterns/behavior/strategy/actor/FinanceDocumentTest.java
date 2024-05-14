package org.nikitinia.patterns.behavior.strategy.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.strategy.exception.FindException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FinanceDocumentTest {

    private final FinanceDocument financeDocument
            = new FinanceDocument();

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

    List<Document> documentListWithOutSignElement = List.of(
            DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.PRESIGN),
            DocumentCreator.documentBuildWithNumberAndStatus(2.0, Status.DRAFT)
    );

    @Test
    void findDocument_shouldReturnResult() {
        financeDocument.findDocument(documentList);

        assertThat(outputStream.toString().trim())
                .isEqualTo("3.0");
    }

    @Test
    void findDocument_shouldThrownException() {
        assertThatThrownBy(() -> financeDocument.findDocument(documentListWithOutSignElement))
                .usingRecursiveComparison()
                .isEqualTo(new FindException());
    }

}