package org.nikitinia.domain.model.documents;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.dictionaries.Type;
import org.nikitinia.domain.model.additional.TextField;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class Document implements Comparable<Document> {

    private Double number;
    private String signatory;
    private Status status;
    private Type type;
    private TextField textField;

    @Override
    public String toString() {
        return "Document{" +
                "number='" + number + '\'' +
                ", status='" + status +
                ", type='" + type +
                ", signatory='" + signatory +
                ", textField=" + textField.toString() +
                '}';
    }

    @Override
    public int compareTo(Document document) {
        return this.getNumber().compareTo(document.getNumber());
    }
}
