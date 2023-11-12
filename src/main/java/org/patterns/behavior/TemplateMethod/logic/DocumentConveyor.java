package org.patterns.behavior.TemplateMethod.logic;

import org.patterns.behavior.TemplateMethod.domain.Document;
import org.patterns.behavior.TemplateMethod.logic.creators.AgreementCreator;
import org.patterns.behavior.TemplateMethod.logic.creators.BillCreator;
import org.patterns.behavior.TemplateMethod.logic.creators.InvoiceCreator;

import java.util.ArrayList;
import java.util.List;

public class DocumentConveyor {

    static List<DocumentCreator> documentCreatorstList = new ArrayList<>();
    static List<Document> documentList= new ArrayList<>();
    public static void main(String[] args) {
        documentCreatorstList.add(new AgreementCreator());
        documentCreatorstList.add(new BillCreator());
        documentCreatorstList.add(new InvoiceCreator());

        documentCreatorstList
                .forEach(dc -> documentList.add(dc.createDocument()));

        System.out.println(documentList);

    }
}