package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.command.documentbuffer.actor.Command;
import org.nikitinia.patterns.behavior.command.documentbuffer.actor.CopyCommand;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;


class CommandHistoryTest {

    private final CommandHistory commandHistory
            = new CommandHistory();

    private final Document document
            = DocumentCreator.documentBuild();

    private final Command command
            = new CopyCommand(document);

    @Test
    void checkCommandHistory() {
        assertThat(commandHistory)
                .hasFieldOrPropertyWithValue("historyCommand", new Stack<>());
    }

    @Test
    void push_shouldPush() {
        Stack<Command> historyCommandEqual = new Stack<>();
        historyCommandEqual.push(command);
        commandHistory.push(command);
        assertThat(commandHistory.getHistoryCommand())
                .isEqualTo(historyCommandEqual);
    }

    @Test
    void pop_shouldPop() {
        commandHistory.push(command);
        assertThat(commandHistory.pop())
                .isEqualTo(command);
    }

    @Test
    void isEmpty_shouldTrue() {
        assertThat(commandHistory.isEmpty())
                .isTrue();
    }

    @Test
    void isEmpty_shouldFalse() {
        commandHistory.push(command);
        assertThat(commandHistory.isEmpty())
                .isFalse();
    }

}