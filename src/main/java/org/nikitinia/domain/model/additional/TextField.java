package org.nikitinia.domain.model.additional;

import lombok.*;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class TextField {

    /*Количество строк в документе*/
    private int line;
    /*Количество столбцов в документе*/
    private int column;
    /*Количество символов в строке*/
    private int quantitySymbolLine;
    /*Текст*/
    private String text;
    /*Текстовый буфер*/
    private String buffer;

    /*Переопределенный метод для демонстрации содержимого*/
    @Override
    public String toString() {
        return "TextField{" +
                "line=" + line + '\'' +
                ", column=" + column + '\'' +
                ", quantitySymbolLine=" + quantitySymbolLine + '\'' +
                ", text='" + text + '\'' +
                ", buffer='" + buffer + '\'' +
                '}';
    }
}
