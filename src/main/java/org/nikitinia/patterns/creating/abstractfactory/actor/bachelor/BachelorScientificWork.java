package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.nikitinia.domain.model.documents.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;

public class BachelorScientificWork implements ScienceResearch {

    @Override
    public ScientificWork getWork() {
        return ScientificWork.builder()
                .number(1)
                .name("ScientificWork")
                .subject("Computer science")
                .typeScience("Engineering")
                .build();
    }
}
