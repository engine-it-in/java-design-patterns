package org.nikitinia.domain.model.documents;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DiplomaTest {

    private final Integer one = 1;
    public static final String TEST = "string";

    private final Diploma diploma =
            Diploma.builder().number(one).averageRate(one).subjects(List.of(TEST)).build();

    @Test
    void checkDiploma() {
        assertThat(diploma)
                .hasFieldOrPropertyWithValue("number", one)
                .hasFieldOrPropertyWithValue("averageRate", one)
                .hasFieldOrPropertyWithValue("subjects", List.of(TEST))
        ;

    }

}