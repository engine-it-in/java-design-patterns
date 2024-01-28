package org.nikitinia.patterns.structure.decorator;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.model.documents.Document;

@AllArgsConstructor
public class Decorator implements Sender {

    private Sender sender;
    @Override
    public String send(SecurityDocument document) {
        return sender.send(document);
    }
}
