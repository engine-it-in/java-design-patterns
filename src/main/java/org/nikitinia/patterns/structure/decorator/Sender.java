package org.nikitinia.patterns.structure.decorator;

import org.nikitinia.domain.model.documents.Document;

public interface Sender {

    String send(SecurityDocument document);

}
