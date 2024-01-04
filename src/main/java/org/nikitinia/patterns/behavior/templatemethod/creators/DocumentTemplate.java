package org.nikitinia.patterns.behavior.templatemethod.creators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.templatemethod.action.Creator;

import java.util.Map;


/*
 * Что -> Абстрактный класс, реализующий общую логику работы шаблонного метода;
 * Для чего -> Выделение общих действий в единый компонент;
 * Реализация -> Абстрактный клсс, реализующий интерфейс по обработке шаблонных действий;
 * В чем выгода -> Регламентация шаблонных этапов;
 * */
@Getter
public abstract class DocumentTemplate implements Creator {

    private final Document document;

    private Map<Double, Document> documentDictionary;

    public DocumentTemplate(Document document) {
        this.document = document;
    }


    @Override
    public Document createDocument() {
        modifyDocument(document);
        documentDictionary = addLink(document);
        visualizeDocument(documentDictionary);
        return document;
    }
    public abstract Map<Double, Document> addLink(Document document);

    public abstract void modifyDocument(Document document);

    public void visualizeDocument(Map<Double, Document> documentDictionary) {
        documentDictionary
                .forEach((key, value) -> System.out.println(
                        "Number is " + key +
                                ", Signatory is " + value.getSignatory() +
                                ", Status is " + value.getStatus()));
    }
}