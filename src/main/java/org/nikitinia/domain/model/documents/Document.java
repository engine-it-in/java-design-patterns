package org.nikitinia.domain.model.documents;

import lombok.*;
import org.nikitinia.domain.model.additional.TextField;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Document {

    private String number;
    private String signatory;
    private int listQuantity;
    private TextField textField;

    @Override
    public String toString() {
        return "Document{" +
                "number='" + number + '\'' +
                ", signatory='" + signatory + '\'' +
                ", listQuantity=" + listQuantity +
                ", textField=" + textField.toString() +
                '}';
    }

}
