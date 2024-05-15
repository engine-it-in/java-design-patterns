package org.nikitinia.domain.model.documents;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScientificWorkTest {

    private final static Integer number = 1;
    private final static String TEST_STRING = "string";

    private final ScientificWork scientificWork =
            ScientificWork.builder()
                    .number(number)
                    .name(TEST_STRING)
                    .subject(TEST_STRING)
                    .typeScience(TEST_STRING)
                    .build();

    @Test
    void checkScientificWork() {
        assertThat(scientificWork)
                .hasFieldOrPropertyWithValue("number", number)
                .hasFieldOrPropertyWithValue("name", TEST_STRING)
                .hasFieldOrPropertyWithValue("subject", TEST_STRING)
                .hasFieldOrPropertyWithValue("typeScience", TEST_STRING)
        ;
    }

}