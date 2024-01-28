package org.nikitinia.patterns.structure.decorator.action;

import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

public class SecuritySender implements Sender {
    @Override
    public String send(SecurityDocument document) {
        return String.format("Send document number %.0f;", document.getNumber());
    }
}
