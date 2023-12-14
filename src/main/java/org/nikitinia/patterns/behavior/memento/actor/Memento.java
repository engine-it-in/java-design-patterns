package org.nikitinia.patterns.behavior.memento.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;

@AllArgsConstructor
@Getter
public class Memento {

    private final Document document;
}
