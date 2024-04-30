package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.dictionary.RatingValue;

import static org.assertj.core.api.Assertions.assertThat;

class MasterRatingTest {

    private final MasterRating masterRating =
            new MasterRating();

    @Test
    void checkMasterRating() {
        assertThat(masterRating)
                .isInstanceOf(Rating.class);
    }

    @Test
    void getGradeShouldReturnResult() {
        assertThat(masterRating.getGrade())
                .isInstanceOf(RatingValue.class)
                .isEqualTo(RatingValue.MIDDLE);
    }

}