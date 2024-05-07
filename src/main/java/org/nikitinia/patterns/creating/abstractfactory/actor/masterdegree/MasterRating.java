package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.nikitinia.patterns.creating.abstractfactory.action.Rating;
import org.nikitinia.patterns.creating.abstractfactory.action.dictionary.RatingValue;

/**
 * Что -> Реализация рейтингования;
 * Для чего -> Формирования результатов рейтингования;
 * Реализация -> Класс;
 * Ценность -> Реализация бизнес логики;
 */
public class MasterRating implements Rating {

    public RatingValue getGrade() {
        return RatingValue.MIDDLE;
    }
}
