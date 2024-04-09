package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.nikitinia.patterns.creating.abstractfactory.action.Rating;

public class BachelorRating implements Rating {

    @Override
    public String getGrade() {
        return "Bachelor rating";
    }
}
