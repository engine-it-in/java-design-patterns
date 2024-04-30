package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.model.documents.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;

import static org.assertj.core.api.Assertions.assertThat;

class BachelorScientificWorkTest {

    private final BachelorScientificWork bachelorScientificWork =
            new BachelorScientificWork();

    @Test
    void checkBachelorScientificWork() {
        assertThat(bachelorScientificWork)
                .isInstanceOf(ScienceResearch.class);
    }

    @Test
    void getWorkShouldReturnResult() {
        assertThat(bachelorScientificWork.getWork())
                .isInstanceOfSatisfying(ScientificWork.class, scientificWork -> {

                    assertThat(scientificWork.number())
                            .isEqualTo(bachelorScientificWork.getWork().number());

                    assertThat(scientificWork.name())
                            .isEqualTo(bachelorScientificWork.getWork().name());

                    assertThat(scientificWork.subject())
                            .isEqualTo(bachelorScientificWork.getWork().subject());

                    assertThat(scientificWork.typeScience())
                            .isEqualTo(bachelorScientificWork.getWork().typeScience());

                });
    }

}