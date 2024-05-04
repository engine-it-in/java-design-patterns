package org.nikitinia.patterns.behavior.state.actor;

import lombok.Getter;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;

import java.util.TreeSet;


/**
 * Что -> Состояние документа -> модель. Не существует само по себе, но при этом обладает определенными атрибутами и поведением;
 * Для чего -> Унификация общей логики, которой должны подчиняться все реализаторы состояния;
 * Реализация -> Абстрактный класс;
 * Ценность -> Инкапсуляция общей логики в единый программный компонент;
 */
@Getter
public abstract class DocumentState {

    public Document document;

    public TreeSet<Document> registerDocuments;

    public DocumentState(Document document) {
        this.document = document;
    }

    public void initRegisterDocument() {
        if (this.registerDocuments == null) {
            this.registerDocuments = new TreeSet<>();
        }
    }

    public boolean checkRegisterDocuments(Document document) {
        return registerDocuments.isEmpty()
                || registerDocuments.contains(document);
    }

    public void addDocument() {
        initRegisterDocument();

        if (checkRegisterDocuments(document)) {
            registerDocuments.add(document);
        }
    }

    public void modifyDocumentStatus(Status status) {
        document.setStatus(status);
    }

    public void notifyDocumentStatus() {
        System.out.println("Document " + document.getNumber() + " have Status " + document.getStatus());
    }


    public void printRegisterDocumentsHistory() {
        for (Document item : registerDocuments) {
            System.out.println("Register document contains document number " + item.getNumber() + " and status " + item.getStatus());
        }
    }


}
