package org.nikitinia.patterns.creating.abstractfactory.action.dictionary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RatingValueTest {

    @Test
    void checkRatingValue() {
        assertThat(RatingValue.values())
                .contains(RatingValue.JUNIOR)
                .contains(RatingValue.MIDDLE)
                .contains(RatingValue.SENIOR);
    }

}