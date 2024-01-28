package org.nikitinia.patterns.structure.decorator.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

import static org.assertj.core.api.Assertions.assertThat;

class SecuritySenderTest {

    private final SecuritySender securitySender =
            new SecuritySender();

    private final SecurityDocument securityDocument =
            new SecurityDocument(DocumentCreator.documentBuildWithNumber(1.0), "string");

    @Test
    void checkSecuritySender() {
        assertThat(securitySender)
                .isInstanceOf(Sender.class);
    }

    @Test
    void send_shouldReturnResult() {
        assertThat(securitySender.send(securityDocument))
                .isEqualTo(String.format("Send document number %.0f;", securityDocument.getNumber()));
    }

}