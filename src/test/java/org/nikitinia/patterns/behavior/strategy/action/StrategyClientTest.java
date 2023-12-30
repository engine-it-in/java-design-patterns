package org.nikitinia.patterns.behavior.strategy.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.strategy.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.strategy.actor.ManagementDocument;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StrategyClientTest {

    StrategyClient strategyClient
            = new StrategyClient();

    List<Document> documentList = List.of(
            DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.PRESIGN),
            DocumentCreator.documentBuildWithNumberAndStatus(2.0, Status.DRAFT),
            DocumentCreator.documentBuildWithNumberAndStatus(3.0, Status.SIGN)
    );

    private final ByteArrayOutputStream outputStream
            = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkStrategyClient() {
        assertThat(strategyClient)
                .hasFieldOrPropertyWithValue("strategy", null);
    }

    @Test
    void executeStrategyFinanceDocument_shouldReturnResult() {

        strategyClient.setStrategy(new FinanceDocument());
        strategyClient.executeStrategy(documentList);

        assertThat(outputStream.toString().trim())
                .isEqualTo("3.0");
    }

    @Test
    void executeStrategyManagementDocument_shouldReturnResult() {

        strategyClient.setStrategy(new ManagementDocument());
        strategyClient.executeStrategy(documentList);

        assertThat(outputStream.toString().trim())
                .isEqualTo("2.0");
    }

}