package org.nikitinia.patterns.behavior.observer.actor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doAnswer;

class OfficeTest {

    private final Office office = new Office();

    @Test
    void checkOffice() {
        assertThat(office)
                .hasFieldOrPropertyWithValue("documents", new ArrayList<>())
                .hasFieldOrPropertyWithValue("subscribes", new ArrayList<>())
        ;
    }

    @Test
    void addObserver_shouldDo() {
        Office officeMock =
                Mockito.mock(Office.class, Mockito.CALLS_REAL_METHODS);

        Subscriber subscriber = new Subscriber("name");

        doAnswer(invocation -> {
            Object arg = invocation.getArgument(0);
            assertEquals(subscriber, arg);
            return null;
        }).when(officeMock).addObserver(subscriber);

        officeMock.addObserver(subscriber);
    }

    @Test
    void addObserver_shouldAdd() {

        Subscriber subscriber = new Subscriber("name");

        office.addObserver(subscriber);

        assertThat(office.getSubscribes())
                .isInstanceOfSatisfying(List.class, list -> {

                    assertThat(list.contains(subscriber))
                            .isTrue();

                });
    }


}