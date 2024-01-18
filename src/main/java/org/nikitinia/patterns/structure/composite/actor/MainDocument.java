package org.nikitinia.patterns.structure.composite.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;

@AllArgsConstructor
@Getter
public abstract class MainDocument {

    private final Document document;

}
