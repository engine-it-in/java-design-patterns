package org.nikitinia.patterns.behavior.templatemethod.run;

import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Bill;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.domain.model.documents.Invoice;
import org.nikitinia.patterns.behavior.templatemethod.creators.AgreementCreator;
import org.nikitinia.patterns.behavior.templatemethod.creators.BillCreator;
import org.nikitinia.patterns.behavior.templatemethod.creators.DocumentCreator;
import org.nikitinia.patterns.behavior.templatemethod.creators.InvoiceCreator;

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