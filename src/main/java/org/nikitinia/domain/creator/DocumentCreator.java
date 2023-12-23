package org.nikitinia.domain.creator;

import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.additional.TextField;
import org.nikitinia.domain.model.documents.Document;

import java.util.List;

public class DocumentCreator {

    public static Document documentBuildWithNumber(Double number) {
        return Document.builder()
                .number(number)
                .signatory("Signatory")
                .textField(textFieldCreator())
                .build();
    }

    public static Document documentBuildWithNumberAndStatus(Double number, Status status) {
        return Document.builder()
                .number(number)
                .signatory("Signatory")
                .status(status)
                .textField(textFieldCreator())
                .build();
    }

    public static Document documentBuild() {
        return Document.builder()
                .number(1.0)
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

    public static List<Document> getDocumentListFromThreeDocument() {
        return List.of(
                documentBuildWithNumber(1.0),
                documentBuildWithNumber(2.0),
                documentBuildWithNumber(2.0)
        );
    }

}