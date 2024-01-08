package org.nikitinia.patterns.behavior.visitor.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class ConverterTest {

    private final Converter converter
            = new Converter();

    private final Document document
            = DocumentCreator.documentBuildWithNumber(1.0);

    private final FinanceDocument financeDocument
            = new FinanceDocument("id", document);
    private final ManagementDocument managementDocument
            = new ManagementDocument("id", document);
    private final PayDocument payDocument
            = new PayDocument("id", document);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkConverter() {
        assertThat(converter)
                .hasFieldOrPropertyWithValue("converterList", new ArrayList<>())
                .isInstanceOf(Visitor.class);
    }

    @Test
    void visitFinanceDocument_shouldDo() {
        converter.visit(financeDocument);

        assertThat(outputStream.toString().trim())
                .isEqualTo("FinanceDocument : id convert to regular document");

        assertThat(converter.getConverterList())
                .contains(financeDocument.getDocument());

    }

    @Test
    void visitManagementDocument_shouldDo() {
        converter.visit(managementDocument);

        assertThat(outputStream.toString().trim())
                .isEqualTo("ManagementDocument : id convert to regular document");

        assertThat(converter.getConverterList())
                .contains(managementDocument.getDocument());
    }

    @Test
    void visitPayDocument_shouldDo() {
        converter.visit(payDocument);

        assertThat(outputStream.toString().trim())
                .isEqualTo("PayDocument : id convert to regular document");

        assertThat(converter.getConverterList())
                .contains(payDocument.getDocument());
    }

}