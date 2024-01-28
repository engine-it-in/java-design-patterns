package org.nikitinia.patterns.structure.decorator.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;
import org.nikitinia.patterns.structure.decorator.dictionary.TypeSecurity;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class DecrypterTest {

    Sender sender = Mockito.mock(Sender.class);

    private final Decrypter decrypter = new Decrypter(sender);

    private final SecurityDocument securityDocument =
            new SecurityDocument(
                    DocumentCreator.documentBuildWithNumber(1.0),
                    "string");

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkDecrypter() {
        assertThat(decrypter)
                .isInstanceOf(Decorator.class)
                .hasFieldOrPropertyWithValue("sender", sender);
    }

    @Test
    void decrypt_shouldReturnResult() {

        assertThat(decrypter.decrypt(securityDocument))
                .isEqualTo(" Document number %.0f - %s;", securityDocument.getNumber(), TypeSecurity.DECRYPT.getValue());

        assertThat(outputStream.toString().trim())
                .contains(String.format("Start decrypt document number %.0f", securityDocument.getNumber()));

        assertThat(outputStream.toString().trim())
                .contains(String.format("End decrypt document number %.0f", securityDocument.getNumber()));
    }

    @Test
    void send_shouldReturnResult() {

        when(sender.send(securityDocument))
                .thenReturn("send");

        assertThat(decrypter.send(securityDocument))
                .contains("send")
                .contains(String.format(" Document number %.0f - %s;", securityDocument.getNumber(), TypeSecurity.DECRYPT.getValue()));

        verify(sender).send(securityDocument);
    }

}