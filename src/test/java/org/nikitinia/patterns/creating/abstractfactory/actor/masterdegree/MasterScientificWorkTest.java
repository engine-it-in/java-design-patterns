package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.model.documents.ScientificWork;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;

import static org.assertj.core.api.Assertions.assertThat;

class MasterScientificWorkTest {

    private final MasterScientificWork masterScientificWork =
            new MasterScientificWork();

    @Test
    void checkMasterScientificWork() {
        assertThat(masterScientificWork)
                .isInstanceOf(ScienceResearch.class);
    }

    @Test
    void getWorkShouldReturnResult() {
        assertThat(masterScientificWork.getWork())
                .isInstanceOfSatisfying(ScientificWork.class, scientificWork -> {

                    assertThat(masterScientificWork.getWork().name())
                            .isEqualTo(scientificWork.name());

                    assertThat(masterScientificWork.getWork().number())
                            .isEqualTo(scientificWork.number());

                    assertThat(masterScientificWork.getWork().subject())
                            .isEqualTo(scientificWork.subject());

                    assertThat(masterScientificWork.getWork().typeScience())
                            .isEqualTo(scientificWork.typeScience());

                });
    }

}