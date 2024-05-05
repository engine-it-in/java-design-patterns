package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.nikitinia.domain.model.documents.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;

/**
 * Что -> ?
 * Для чего -> ?
 * Реализация -> ?
 * Ценность -> ?
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
