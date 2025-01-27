package org.nikitinia.patterns.behavior.visitor.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;
import org.nikitinia.patterns.behavior.visitor.action.Converter;
import org.nikitinia.patterns.behavior.visitor.action.Register;
import org.nikitinia.patterns.behavior.visitor.action.Acceptor;

public class Program {

    public static void main(String[] args) {

        Document documentFin = DocumentCreator.documentBuildWithNumber(1.0);
        Document documentMan = DocumentCreator.documentBuildWithNumber(2.0);
        Document documentPay = DocumentCreator.documentBuildWithNumber(3.0);


        Acceptor financeDocument = new FinanceDocument("1111/0000", documentFin);
        Acceptor managementDocument = new ManagementDocument("2222/1111", documentMan);
        Acceptor payDocument = new PayDocument("3333/1111", documentPay);

        Register register = new Register();
        Converter converter = new Converter();

        financeDocument.accept(register);
        managementDocument.accept(register);
        payDocument.accept(register);

        financeDocument.accept(converter);
        managementDocument.accept(converter);
        payDocument.accept(converter);

        register.getRegisterMap()
                .forEach((key, value) -> {
                    System.out.println("Document id" + " : " + key + " registered");
                });

        converter.getConverterList()
                .forEach(document -> {
                    document.setStatus(Status.SIGN);
                    document.setSignatory("signatory");
                    System.out.println(document);
                });
    }

}


