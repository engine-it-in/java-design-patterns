package org.nikitinia.patterns.behavior.memento.actor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.nikitinia.domain.model.documents.Document;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    Repository repository = new Repository();
    Document document = new Document();
    Memento memento = new Memento(document);


    static Document documentStatic = new Document();
    static Memento mementoStatic = new Memento(documentStatic);


    @Test
    void checkRepository() {
        assertThat(repository)
                .hasFieldOrPropertyWithValue("memento", null);

    }

    @Test
    void setMementoRepository_shouldReturnResult() {

        repository.setMemento(memento);

        assertThat(repository)
                .hasFieldOrPropertyWithValue("memento", memento);

    }

    @ParameterizedTest
    @MethodSource("provideNullAndMemento")
    void getMementoRepository_shouldReturnResult(Object mementoObject) {

        repository.setMemento((Memento) mementoObject);

        assertThat(repository)
                .hasFieldOrPropertyWithValue("memento", mementoObject);

    }

    public static Stream<Arguments> provideNullAndMemento() {
        return Stream.of(
                Arguments.of((Object) null),
                Arguments.of(mementoStatic)
        );
    }

}