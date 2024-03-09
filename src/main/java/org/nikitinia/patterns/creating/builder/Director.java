package org.nikitinia.patterns.creating.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Director {

    Builder builder;

    OfficalDocument houseBuilder() {
        builder.createOfficialDocument();
        builder.buildType();
        builder.buildDocument();
        builder.buildType();
        builder.buildSignatory();
        builder.buildName();
        return builder.getOfficalDocument();
    }

}
