package org.nikitinia.patterns.behavior.templatemethod.run;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.templatemethod.creators.AgreementTemplate;
import org.nikitinia.patterns.behavior.templatemethod.creators.DocumentTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DocumentConveyor {

    static List<DocumentTemplate> documentCreatorstList
            = new ArrayList<>();
    static List<Document> documentList
            = new ArrayList<>();
    public static void main(String[] args) {
        documentCreatorstList.add(new AgreementTemplate(new Agreement(), new HashMap<>()));
//        documentCreatorstList.add(new BillCreator(new Bill()));
//        documentCreatorstList.add(new InvoiceCreator(new Invoice()));

        documentCreatorstList
                .forEach(dc -> documentList.add(dc.createDocument()));

        System.out.println(documentList);

    }
}