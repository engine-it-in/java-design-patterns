package org.nikitinia.patterns.behavior.memento.actor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MementoTest {

    static Document document =
            DocumentCreator.documentBuildWithNumber(1.0);

    Memento memento =
            new Memento(document);


    @Test
    void checkMemento() {
        assertThat(memento)
                .hasFieldOrPropertyWithValue("document", document)
                .hasFieldOrPropertyWithValue("mementoHistory", new LinkedList<>());
    }

    @Test
    void pushHistoryCheck() {
        memento.pushHistory(document);

        assertThat(memento.mementoHistory)
                .isInstanceOf(Queue.class)
                .contains(document);
    }

    @ParameterizedTest
    @MethodSource("provideNullAndDocument")
    void pollHistory_shouldReturnNull(Object doc) {
        memento.pushHistory((Document) doc);

        assertThat(memento.pollHistory())
                .usingRecursiveComparison()
                .isEqualTo(doc);
    }

    private static Stream<Arguments> provideNullAndDocument() {
        return Stream.of(
                Arguments.of((Object) null),
                Arguments.of(document)
        );

    }


}