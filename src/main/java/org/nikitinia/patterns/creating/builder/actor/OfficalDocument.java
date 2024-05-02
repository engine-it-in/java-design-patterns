package org.nikitinia.patterns.creating.builder.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> ?
 * Для чего -> ?
 * Реализация -> ?
 * Ценность -> ?
 */
@Getter
@Setter
public class OfficalDocument {

    private String name;

    private String type;

    private String signatory;

    private Document document;

    @Override
    public String toString() {
        return "OfficalDocument{\n" +
                "name= " + name + "\n" +
                ", type=" + type + "\n" +
                ", signatory=" + signatory + "\n" +
                ", document=" + document + "\n" +
                '}';
    }
}