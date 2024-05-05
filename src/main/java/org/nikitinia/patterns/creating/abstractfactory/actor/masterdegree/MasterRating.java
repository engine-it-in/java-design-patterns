package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.dictionary.RatingValue;

/**
 * Что -> ?
 * Для чего -> ?
 * Реализация -> ?
 * Ценность -> ?
 */
public class MasterRating implements Rating {

    public RatingValue getGrade() {
        return RatingValue.MIDDLE;
    }
}
