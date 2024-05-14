package org.nikitinia.domain.creator;

import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.model.documents.Agreement;

public class AgreementCreator {

    public static Agreement agreementBuildWithNumberAndStatus(Double number, Status status) {
        return new Agreement(number, null, status, null, null, null, null, null);
    }

    public static Agreement agreementBuildWithNumberAndSignatoryAndStatus(Double number, String signatory, Status status) {
        return new Agreement(number, signatory, status, null, null, null, null, null);
    }

}
