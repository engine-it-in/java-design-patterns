package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class CommandTest {

    @Test
    void checkStructureCommand() {
        Command command = Mockito.mock(
                Command.class,
                Mockito.CALLS_REAL_METHODS
        );

        assertThat(command)
                .isInstanceOfSatisfying(
                        Command.class,
                        commandData -> {
                            assertThat(commandData)
                                    .hasFieldOrProperty("document")
                                    .hasFieldOrProperty("backUp");
                        }
                );

    }

}
