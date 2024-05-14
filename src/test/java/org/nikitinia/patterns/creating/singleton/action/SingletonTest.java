package org.nikitinia.patterns.creating.singleton.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import static org.assertj.core.api.Assertions.assertThat;

class SingletonTest {

    private static final Document documentFirst =
            DocumentCreator.documentBuildWithNumber(1.0);

    private final Document documentSecond =
            DocumentCreator.documentBuildWithNumber(1.0);

    private final Singleton singleton = Singleton.getInstance(documentFirst);

    @Test
    void checkSingleton() {
        assertThat(singleton)
                .hasFieldOrPropertyWithValue("document", documentFirst)
        ;
    }

    @Test
    void getInstanceShouldReturnSingleton() {
        assertThat(Singleton.getInstance(documentFirst))
                .usingRecursiveComparison()
                .isEqualTo(singleton);
    }

    @Test
    void getInstanceShouldReturnInstance() {
        assertThat(Singleton.getInstance(documentSecond))
                .usingRecursiveComparison()
                .isEqualTo(singleton);
    }


}