package org.nikitinia.domain.creator;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.domain.model.documents.TextField;

public class Creator {

    public static Document documentCreator() {
        return Document.builder()
                .number("Number#1")
                .signatory("Signatory")
                .listQuantity(1)
                .textField(textFieldCreator())
                .build();
    }

    public static TextField textFieldCreator() {
        return TextField.builder()
                .font("Arial")
                .line(2)
                .column(2)
                .quantitySymbolLine(123)
                .text("someText")
                .buffer(null)
                .build();
    }

}