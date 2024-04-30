package org.nikitinia.patterns.creating.abstractfactory.util;

import org.nikitinia.domain.model.documents.Diploma;

import java.util.List;

public class DataBuilder {

    public static List<String> getSubjectForBachelor() {
        return List.of(
                "Higher Math",
                "History"
        );
    }

    public static List<String> getSubjectForMaster() {
        return List.of(
                "Higher Math",
                "History",
                "Language"
        );
    }

}
