package org.nikitinia.patterns.creating.abstractfactory.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.model.documents.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.actor.bachelor.BachelorScientificWork;

import static org.assertj.core.api.Assertions.assertThat;

class ScienceResearchTest {

    private final ScienceResearch scienceResearch =
            new BachelorScientificWork();

    @Test
    void checkScienceResearch() {
        assertThat(scienceResearch)
                .isInstanceOfSatisfying(ScienceResearch.class, scienceResearchData -> {
                    assertThat(scienceResearchData.getWork())
                            .isInstanceOf(ScientificWork.class);
                });
    }

}