package org.nikitinia.patterns.structure.decorator.action;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.decorator.dictionary.TypeSecurity;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

@Slf4j
public class Encrypter extends Decorator {

    public Encrypter(Sender sender) {
        super(sender);
    }

    public String encrypt(SecurityDocument document) {
        log.info("Start encrypt document number {}", document.getNumber());
        document.setTypeSecurity(TypeSecurity.ENCRYPT.getValue());
        log.info("End encrypt document number {}", document.getNumber());
        return String.format(" Document number %.0f - %s;", document.getNumber(), document.getTypeSecurity());
    }

    @Override
    public String send(SecurityDocument document) {
        return String.join("", super.send(document), encrypt(document));
    }
}
