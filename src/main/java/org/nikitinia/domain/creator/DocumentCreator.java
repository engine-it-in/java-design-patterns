package org.nikitinia.domain.creator;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.domain.model.additional.TextField;

public class DocumentCreator {

    public static Document documentBuild() {
        return Document.builder()
                .number("Number#1")
                .signatory("Signatory")
                .textField(textFieldCreator())
                .build();
    }

    public static TextField textFieldCreator() {
        return TextField.builder()
                .line(2)
                .column(2)
                .quantitySymbolLine(123)
                .text("someText")
                .buffer(null)
                .build();
    }

}