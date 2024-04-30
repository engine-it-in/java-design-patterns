package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.abstractfactory.action.factory.EducationAttributeFactory;

import static org.assertj.core.api.Assertions.assertThat;

class BachelorAttributeSetTest {

    private final BachelorAttributeSet bachelorAttributeSet =
            new BachelorAttributeSet();

    @Test
    void checkBachelorAttributeSet() {
        assertThat(bachelorAttributeSet)
                .isInstanceOf(EducationAttributeFactory.class);
    }

    @Test
    void getDiplomaShouldReturnSuccess() {
        assertThat(bachelorAttributeSet.getDiploma())
                .usingRecursiveComparison()
                .isEqualTo(new BachelorCertify());
    }

    @Test
    void getRatingShouldReturnResult() {
        assertThat(bachelorAttributeSet.getRating())
                .usingRecursiveComparison()
                .isEqualTo(new BachelorRating());
    }

    @Test
    void getScientificWorkShould() {
        assertThat(bachelorAttributeSet.getScientificWork())
                .usingRecursiveComparison()
                .isEqualTo(new BachelorScientificWork());
    }

}