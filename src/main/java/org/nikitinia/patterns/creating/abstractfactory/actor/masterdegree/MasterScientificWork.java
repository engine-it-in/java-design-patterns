package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.nikitinia.domain.model.documents.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;

/**
 * Что -> Реализация научной работы;
 * Для чего -> Формирования результатов научной работы;
 * Реализация -> Класс;
 * Ценность -> Реализация бизнес логики;
 */
public class MasterScientificWork implements ScienceResearch {

    @Override
    public ScientificWork getWork() {
        return ScientificWork.builder()
                .number(1)
                .name("Master work")
                .subject("Math research")
                .typeScience("Math")
                .build();
    }
}
