package org.nikitinia.patterns.behavior.visitor.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nikitinia.patterns.behavior.visitor.util.TestBuilder.*;

class ConverterTest {

    private final Converter converter
            = new Converter();

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
        converter.visit(testFinanceDocument);

        assertThat(outputStream.toString().trim())
                .isEqualTo("FinanceDocument : id convert to regular document");

        assertThat(converter.getConverterList())
                .hasSize(1)
                .contains(testFinanceDocument.getDocument());

    }

    @Test
    void visitManagementDocument_shouldDo() {
        converter.visit(testManagementDocument);

        assertThat(outputStream.toString().trim())
                .isEqualTo("ManagementDocument : id convert to regular document");

        assertThat(converter.getConverterList())
                .hasSize(1)
                .contains(testManagementDocument.getDocument());
    }

    @Test
    void visitPayDocument_shouldDo() {
        converter.visit(testPayDocument);

        assertThat(outputStream.toString().trim())
                .isEqualTo("PayDocument : id convert to regular document");

        assertThat(converter.getConverterList())
                .hasSize(1)
                .contains(testPayDocument.getDocument());
    }

}