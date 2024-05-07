package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.nikitinia.domain.model.documents.Diploma;
import org.nikitinia.patterns.creating.abstractfactory.action.Certify;

import static org.nikitinia.patterns.creating.abstractfactory.util.DataBuilder.getSubjectForMaster;

/**
 * Что -> Реализация сертификации;
 * Для чего -> Формирования результатов сертификации;
 * Реализация -> Класс;
 * Ценность -> Реализация бизнес логики;
 */
public class MasterCertify implements Certify {

    @Override
    public Diploma getDocument() {
        return Diploma.builder()
                .number(3)
                .averageRate(9)
                .subjects(getSubjectForMaster())
                .build();
    }
}
