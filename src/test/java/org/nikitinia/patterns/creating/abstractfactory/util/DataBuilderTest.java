package org.nikitinia.patterns.creating.abstractfactory.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nikitinia.patterns.creating.abstractfactory.util.DataBuilder.*;

class DataBuilderTest {

    @Test
    void checkGetSubjectForBachelor() {
        assertThat(DataBuilder.getSubjectForBachelor())
                .contains(MATH)
                .contains(HISTORY)
        ;
    }

    @Test
    void checkGetSubjectForMaster() {
        assertThat(DataBuilder.getSubjectForMaster())
                .contains(MATH)
                .contains(HISTORY)
                .contains(LANGUAGE)
        ;
    }

}