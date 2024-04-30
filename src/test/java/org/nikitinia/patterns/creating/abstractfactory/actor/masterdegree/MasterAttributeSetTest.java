package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.abstractfactory.action.factory.EducationAttributeFactory;

import static org.assertj.core.api.Assertions.assertThat;

class MasterAttributeSetTest {

    private final MasterAttributeSet masterAttributeSet =
            new MasterAttributeSet();

    @Test
    void checkMasterAttributeSetTest() {
        assertThat(masterAttributeSet)
                .isInstanceOf(EducationAttributeFactory.class);
    }

    @Test
    void getDiplomaShouldReturnResult() {
        assertThat(masterAttributeSet.getDiploma())
                .usingRecursiveComparison()
                .isEqualTo(new MasterCertify());
    }

    @Test
    void getRatingShouldReturnResult() {
        assertThat(masterAttributeSet.getScientificWork())
                .usingRecursiveComparison()
                .isEqualTo(new MasterScientificWork());
    }

}