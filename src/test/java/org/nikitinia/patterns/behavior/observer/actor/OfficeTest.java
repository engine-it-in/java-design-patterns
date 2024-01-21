package org.nikitinia.patterns.behavior.observer.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doAnswer;

class OfficeTest {

    private final Office office = new Office();

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkOffice() {
        assertThat(office)
                .hasFieldOrPropertyWithValue("documents", new ArrayList<>())
                .hasFieldOrPropertyWithValue("subscribes", new ArrayList<>());
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
                .isInstanceOfSatisfying(
                        List.class,
                        list -> assertThat(list.contains(subscriber))
                                .isTrue());
    }

    @Test
    void removeObserver_shouldDo() {
        Subscriber subscriber = new Subscriber("name");

        office.removeObserver(subscriber);

        assertThat(office.getSubscribes())
                .isInstanceOfSatisfying(
                        List.class,
                        list -> assertThat(list.size())
                                .isEqualTo(0));
    }

    @Test
    void notifyObserver_shouldDo() {
        Subscriber subscriber = new Subscriber("name");
        Document document = DocumentCreator.documentBuildWithNumber(1.0);
        office.addObserver(subscriber);
        office.addDocument(document);
        office.notifyObserver("add");

        assertThat(outputStream.toString().trim())
                .contains(
                        "name [Document{number='1.0', status='null, type='null, signatory='Signatory, " +
                                "textField=TextField{line=2', " +
                                "column=2', quantitySymbolLine=123', " +
                                "text='someText', buffer='null'}}] add");
    }

    @Test
    void addDocument_shouldDo() {
        Subscriber subscriber = new Subscriber("name");
        Document document = DocumentCreator.documentBuildWithNumber(1.0);
        office.addObserver(subscriber);
        office.addDocument(document);

        assertThat(outputStream.toString().trim())
                .isEqualTo(
                        "name [Document{number='1.0', status='null, type='null, signatory='Signatory, " +
                                "textField=TextField{line=2', " +
                                "column=2', quantitySymbolLine=123', " +
                                "text='someText', buffer='null'}}] add");


    }

    @Test
    void removeDocument_shouldDo() {
        Subscriber subscriber = new Subscriber("name");
        Document document = DocumentCreator.documentBuildWithNumber(1.0);
        office.addObserver(subscriber);
        office.addDocument(document);
        office.removeDocument(document);

        assertThat(outputStream.toString().trim())
                .contains(
                        "name [Document{number='1.0', status='null, type='null, signatory='Signatory, " +
                                "textField=TextField{line=2', " +
                                "column=2', quantitySymbolLine=123', " +
                                "text='someText', buffer='null'}}] remove");


    }


}