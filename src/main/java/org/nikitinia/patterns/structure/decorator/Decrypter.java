package org.nikitinia.patterns.structure.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Decrypter extends Decorator {

    public Decrypter(Sender sender) {
        super(sender);
    }

    public String decrypt(SecurityDocument document) {
        log.info("Start decrypt document number {}", document.getNumber());
        document.setTypeSecurity(TypeSecurity.DECRYPT.value);
        log.info("End decrypt document number {}", document.getNumber());
        return String.format(" Document number %.0f - %s;", document.getNumber(), document.getTypeSecurity());

    }

    @Override
    public String send(SecurityDocument document) {
        return String.join("", super.send(document), decrypt(document));
    }
}
