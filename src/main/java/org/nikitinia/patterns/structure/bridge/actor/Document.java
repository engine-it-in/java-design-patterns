package org.nikitinia.patterns.structure.bridge.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

/*
 * Что -> ;
 * Для чего -> ;
 * Реализация -> ;
 * В чем выгода -> ;
 * */
@Getter
@AllArgsConstructor
public abstract class Document {

    Interfaze interfaze;

    public abstract void createDocument(org.nikitinia.domain.model.documents.Document document);

}
