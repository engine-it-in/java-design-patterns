package org.nikitinia.domain.creator;

import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.model.documents.Invoice;

public class InvoiceCreator {

    public static Invoice invoiceBuildWithNumberAndStatus(Double number, Status status) {
        return new Invoice(number, null, status,null,  null, null, null);
    }

}
