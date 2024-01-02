package org.nikitinia.patterns.behavior.templatemethod.run;

import org.nikitinia.domain.creator.AgreementCreator;
import org.nikitinia.domain.creator.BillCreator;
import org.nikitinia.domain.creator.InvoiceCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Bill;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.domain.model.documents.Invoice;
import org.nikitinia.patterns.behavior.templatemethod.creators.AgreementTemplate;
import org.nikitinia.patterns.behavior.templatemethod.creators.BillTemplate;
import org.nikitinia.patterns.behavior.templatemethod.creators.DocumentTemplate;
import org.nikitinia.patterns.behavior.templatemethod.creators.InvoiceTemplate;

import java.util.ArrayList;
import java.util.List;

public class DocumentConveyor {

    static List<DocumentTemplate> documentCreatorstList
            = new ArrayList<>();
    static List<Document> documentList
            = new ArrayList<>();

    public static void main(String[] args) {

        Agreement agreement = AgreementCreator.agreementBuildWithNumberAndStatus(1.0, Status.DRAFT);
        Bill bill = BillCreator.billBuildWithNumberAndStatus(2.0, Status.DRAFT);
        Invoice invoice = InvoiceCreator.invoiceBuildWithNumberAndStatus(3.0, Status.DRAFT);

        documentCreatorstList.add(new AgreementTemplate(agreement));
        documentCreatorstList.add(new BillTemplate(bill));
        documentCreatorstList.add(new InvoiceTemplate(invoice));

        documentCreatorstList
                .forEach(dc -> documentList.add(dc.createDocument()));
    }
}