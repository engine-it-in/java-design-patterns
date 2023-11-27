package org.nikitinia.domain.model.documents;

import lombok.*;
import org.nikitinia.domain.model.additional.TextField;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Document {

    /*Номер документа*/
    private String number;
    /*Подпись на документе*/
    private String signatory;
    /*Блок с текстовой информацией на документе*/
    private TextField textField;

    /*Переопределенный метод для демонстрации содержимого*/
    @Override
    public String toString() {
        return "Document{" +
                "number='" + number + '\'' +
                ", signatory='" + signatory +
                ", textField=" + textField.toString() +
                '}';
    }

}
