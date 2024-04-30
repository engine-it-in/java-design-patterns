package org.nikitinia.patterns.creating.abstractfactory.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.creating.abstractfactory.action.dictionary.RatingValue;

import static org.assertj.core.api.Assertions.assertThat;

class RatingTest {

    class RatingCheck implements Rating {

        @Override
        public RatingValue getGrade() {
            return RatingValue.JUNIOR;
        }
    }

    private final Rating rating =
            new RatingCheck();

    @Test
    void checkRating() {
        assertThat(rating)
                .isInstanceOfSatisfying(Rating.class, ratingData -> {

                    assertThat(ratingData.getGrade())
                            .isInstanceOf(RatingValue.class);

                });
    }

}