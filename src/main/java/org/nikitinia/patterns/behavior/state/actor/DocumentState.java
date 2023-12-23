package org.nikitinia.patterns.behavior.state.actor;

import lombok.Getter;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;

import java.util.TreeSet;
import java.util.function.Predicate;

@Getter
public abstract class DocumentState implements Predicate<Document> {

    public Document document;

    public TreeSet<Document> registerDocuments;

    public DocumentState(Document document) {
        this.document = document;
    }

    public TreeSet<Document> initRegisterDocument(TreeSet<Document> registerDocuments) {
        return registerDocuments == null
                ? new TreeSet<>()
                : registerDocuments;
    }

    public boolean test(Document document) {
        return registerDocuments.isEmpty()
                || registerDocuments.contains(document);
    }

    public void addDocument() {
        registerDocuments = initRegisterDocument(registerDocuments);

        if (test(document)) {
            registerDocuments.add(document);
        }
    }

    public void modifyStatus(Status status) {
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
