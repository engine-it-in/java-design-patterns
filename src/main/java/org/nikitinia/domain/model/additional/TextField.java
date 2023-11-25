package org.nikitinia.domain.model.additional;

import lombok.*;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class TextField {

    private String font;
    private int line;
    private int column;
    private int quantitySymbolLine;
    private String text;
    private String buffer;

    @Override
    public String toString() {
        return "TextField{" +
                "font='" + font + '\'' +
                ", line=" + line +
                ", column=" + column +
                ", quantitySymbolLine=" + quantitySymbolLine +
                ", text='" + text + '\'' +
                ", buffer='" + buffer + '\'' +
                '}';
    }
}
