package org.nikitinia.patterns.behavior.chainofresponsobility.dictionary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class PriorityTest {

    @ParameterizedTest
    @EnumSource(Priority.class)
    void checkTypeSystem(Priority priority) {

        int priorityValue = priority.level;

        assertThat(priorityValue)
                .isIn(
                        Priority.VIP.getLevel(),
                        Priority.CRITICAL.getLevel(),
                        Priority.NORMAL.getLevel()
                );
    }

}