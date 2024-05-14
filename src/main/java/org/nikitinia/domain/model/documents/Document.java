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

    /*Номер документа*/
    private Double number;
    /*Подпись на документе*/
    private String signatory;
    /*Статус документа*/
    private Status status;
    /*Тип документа для представления*/
    private Type type;
    /*Блок с текстовой информацией на документе*/
    private TextField textField;

    /*Переопределенный метод для демонстрации содержимого*/
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
