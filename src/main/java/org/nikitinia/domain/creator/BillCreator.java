package org.nikitinia.domain.creator;

import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Agreement;
import org.nikitinia.domain.model.documents.Bill;

public class BillCreator {

    public static Bill billBuildWithNumberAndStatus(Double number, Status status) {
        return new Bill(number, null, status, null, null, null, null);
    }

}
