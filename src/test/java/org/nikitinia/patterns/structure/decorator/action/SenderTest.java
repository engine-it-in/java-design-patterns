package org.nikitinia.patterns.structure.decorator.action;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class SenderTest {

    Sender sender = Mockito.mock(Sender.class);

    private final SecurityDocument securityDocument =
            new SecurityDocument(
                    DocumentCreator.documentBuildWithNumber(1.0),
                    "string"
            );

    @Test
    void send() {
        when(sender.send(securityDocument))
                .thenReturn("string");

        assertThat(sender.send(securityDocument))
                .isEqualTo("string");

        verify(sender).send(securityDocument);

    }

}