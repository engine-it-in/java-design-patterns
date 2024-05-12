package org.nikitinia.patterns.creating.builder.action;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.creating.builder.actor.OfficalDocument;

/**
 * Что -> ?;
 * Для чего -> ?;
 * Реализация -> ?;
 * Ценность -> ?;
 */
@AllArgsConstructor
public class Director {

    Builder builder;

    public OfficalDocument documentBuilder() {
        builder.createOfficialDocument();
        builder.buildType();
        builder.buildDocument();
        builder.buildType();
        builder.buildSignatory();
        builder.buildName();
        return builder.getOfficalDocument();
    }

}
