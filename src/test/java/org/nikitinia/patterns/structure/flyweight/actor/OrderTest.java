package org.nikitinia.patterns.structure.flyweight.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.flyweight.action.Archive;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {

    private final Order order = new Order();

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    private final Document document = DocumentCreator.documentBuildWithNumber(1.0);

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkOrder() {
        assertThat(order)
                .isInstanceOfSatisfying(Order.class, orderData -> {

                    assertThat(orderData)
                            .isInstanceOf(Archive.class);

                    assertThat(orderData.getCompany())
                            .containsPattern(Pattern.compile("[a-zA-Z0-9]*"));

                    assertThat(orderData.getArchiveBox())
                            .usingRecursiveComparison()
                            .isEqualTo(new HashMap<>());
                });
    }

    @Test
    void archive_shouldReturnResult() {
        order.archive(document);

        assertThat(order.getArchiveBox())
                .containsEntry(document.getNumber().longValue(), document);

        assertThat(outputStream.toString().trim())
                .contains("Order number")
                .contains(document.getNumber().toString())
                .contains("put in Archive, for company")
                .contains(order.getCompany());
    }

}