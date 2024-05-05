package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.dictionary.RatingValue;

/**
 * Что -> ?
 * Для чего -> ?
 * Реализация -> ?
 * Ценность -> ?
 */
public class BachelorRating implements Rating {

    @Override
    public RatingValue getGrade() {
        return RatingValue.JUNIOR;
    }
}
