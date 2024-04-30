package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.dictionary.RatingValue;

import static org.assertj.core.api.Assertions.assertThat;

class BachelorRatingTest {

    private final BachelorRating bachelorRating =
            new BachelorRating();

    @Test
    void checkBachelorRating() {
        assertThat(bachelorRating)
                .isInstanceOf(Rating.class);
    }

    @Test
    void getGradeShouldReturnResult() {
        assertThat(bachelorRating.getGrade())
                .isEqualTo(RatingValue.JUNIOR);
    }

}