package org.nikitinia.patterns.behavior.state.actor;

import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;

import java.util.TreeSet;
import java.util.function.Predicate;

public class DocumentStop implements DocumentActivity, Predicate<Document> {

    public Document document;
    public TreeSet<Document> registerDocuments;

    public DocumentStop(Document document) {
        this.document = document;
    }

    @Override
    public void doAction() {

        registerDocuments = initRegisterDocument(registerDocuments);

        if (test(document)) {
            registerDocuments.add(document);
        }

        document.setStatus(Status.SIGN);
        System.out.println("Document " + document.getNumber() + " getStatus " + document.getStatus());
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

    @Override
    public void printHistory() {
        for (Document item: registerDocuments) {
            System.out.println("Register document contains document number " + item.getNumber() + " and status " + item.getStatus());
        }
    }

}
