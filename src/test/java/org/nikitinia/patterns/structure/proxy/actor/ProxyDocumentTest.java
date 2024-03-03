package org.nikitinia.patterns.structure.proxy.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.structure.proxy.action.PrintForm;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class ProxyDocumentTest {

    private final Double number = 1.0;
    private final ProxyDocument proxyDocument =
            new ProxyDocument(number);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkProxyDocument() {
        assertThat(proxyDocument)
                .isInstanceOf(PrintForm.class)
                .hasFieldOrPropertyWithValue("documentNumber", 1.0)
                .hasFieldOrPropertyWithValue("documentForm", null)
        ;
    }

    @Test
    void display_shouldDoResult() {
        proxyDocument.display();

        assertThat(outputStream.toString().trim())
                .contains("Work with object")
                .contains("Display document with number")
                .contains(number.toString());
    }

}