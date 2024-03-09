package org.nikitinia.patterns.creating.builder;

import lombok.Getter;

@Getter
public abstract class Builder {

    OfficalDocument officalDocument;

    void createOfficialDocument() {
        officalDocument = new OfficalDocument();
    }

    abstract void buildName();

    abstract void buildType();

    abstract void buildSignatory();

    abstract void buildDocument();

}
