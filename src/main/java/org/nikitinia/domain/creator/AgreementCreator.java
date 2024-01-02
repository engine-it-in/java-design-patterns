package org.nikitinia.domain.creator;

import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Agreement;

import static org.nikitinia.domain.creator.DocumentCreator.textFieldCreator;

public class AgreementCreator {

    public static Agreement agreementBuildWithNumberAndStatus(Double number, Status status) {
        return new Agreement(number, null, status, null, null, null, null, null);
    }

}
