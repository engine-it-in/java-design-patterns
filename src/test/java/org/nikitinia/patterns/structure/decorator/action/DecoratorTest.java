package org.nikitinia.patterns.structure.decorator.action;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class DecoratorTest {

    Sender sender = Mockito.mock(Sender.class);

    private final Decorator decorator =
            new Decorator(sender);

    private final SecurityDocument securityDocument =
            new SecurityDocument(DocumentCreator.documentBuildWithNumber(1.0), "string");

    @Test
    void checkDecorator() {
        assertThat(decorator)
                .isInstanceOf(Sender.class)
                .hasFieldOrPropertyWithValue("sender", sender);
    }

    @Test
    void send_shouldDo() {

        when(sender.send(securityDocument))
                .thenReturn("string");

        assertThat(decorator.send(securityDocument))
                .isEqualTo("string");

        verify(sender).send(securityDocument);

    }

}