package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.nikitinia.domain.model.documents.Diploma;
import org.nikitinia.patterns.creating.abstractfactory.action.Certify;

import static org.nikitinia.patterns.creating.abstractfactory.util.DataBuilder.getSubjectForBachelor;

public class BachelorCertify implements Certify {

    @Override
    public Diploma getDocument() {
        return Diploma.builder()
                .number(1)
                .averageRate(9)
                .subjects(getSubjectForBachelor())
                .build();
    }
}
