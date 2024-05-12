package org.nikitinia.patterns.creating.builder.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Класс, реализующий конкретную логику;
 * Для чего -> Реализация требуемого поведения;
 * Реализация -> Класс, наследующий алгоритм создания объекта;
 * Ценность -> Реализация необходимых шагов, требуемых для создания объекта;
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