package org.nikitinia.patterns.behavior.TemplateMethod.logic.run;

import org.nikitinia.domain.Agreement;
import org.nikitinia.domain.Bill;
import org.nikitinia.domain.Document;
import org.nikitinia.domain.Invoice;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.AgreementCreator;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.BillCreator;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.DocumentCreator;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.InvoiceCreator;

import java.util.ArrayList;
import java.util.List;

public class DocumentConveyor {

    static List<DocumentCreator> documentCreatorstList = new ArrayList<>();
    static List<Document> documentList= new ArrayList<>();
    public static void main(String[] args) {
        documentCreatorstList.add(new AgreementCreator(new Agreement()));
        documentCreatorstList.add(new BillCreator(new Bill()));
        documentCreatorstList.add(new InvoiceCreator(new Invoice()));

        documentCreatorstList
                .forEach(dc -> documentList.add(dc.createDocument()));

        System.out.println(documentList);

    }
}