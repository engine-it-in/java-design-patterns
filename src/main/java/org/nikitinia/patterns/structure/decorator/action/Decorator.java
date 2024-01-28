package org.nikitinia.patterns.structure.decorator.action;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

@AllArgsConstructor
public class Decorator implements Sender {

    private Sender sender;
    @Override
    public String send(SecurityDocument document) {

        return sender.send(document);
    }
}
