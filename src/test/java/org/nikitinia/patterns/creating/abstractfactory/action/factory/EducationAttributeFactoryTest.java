package org.nikitinia.patterns.creating.abstractfactory.action.factory;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.abstractfactory.action.Certify;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.ScienceResearch;
import org.nikitinia.patterns.creating.abstractfactory.actor.bachelor.BachelorAttributeSet;

import static org.assertj.core.api.Assertions.assertThat;


class EducationAttributeFactoryTest {

    private final EducationAttributeFactory attributeFactory =
            new BachelorAttributeSet();

    @Test
    void checkEducationAttributeFactory() {
        assertThat(attributeFactory)
                .isInstanceOfSatisfying(EducationAttributeFactory.class, educationAttributeFactory -> {

                    assertThat(educationAttributeFactory.getDiploma())
                            .isInstanceOf(Certify.class);

                    assertThat(educationAttributeFactory.getRating())
                            .isInstanceOf(Rating.class);

                    assertThat(educationAttributeFactory.getScientificWork())
                            .isInstanceOf(ScienceResearch.class);

                });
    }

}