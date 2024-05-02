package org.nikitinia.patterns.creating.singleton.action;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingletonTest {

    public static final String TEST = "string";
    public static final String ALTERNATIVE = "not string";

    private final Singleton singleton = Singleton.getInstance(TEST);

    @Test
    void checkSingleton() {
        assertThat(singleton)
                .hasFieldOrPropertyWithValue("value", TEST)
        ;
    }

    @Test
    void getInstanceShouldReturnSingleton() {
        assertThat(Singleton.getInstance(TEST))
                .usingRecursiveComparison()
                .isEqualTo(singleton);
    }

    @Test
    void getInstanceShouldReturnInstance() {
        assertThat(Singleton.getInstance(ALTERNATIVE))
                .usingRecursiveComparison()
                .isEqualTo(singleton);
    }


}