package org.nikitinia.patterns.behavior.strategy.run;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.strategy.action.StrategyClient;
import org.nikitinia.patterns.behavior.strategy.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.strategy.actor.ManagementDocument;

import java.util.List;


public class Program {

    public static void main(String[] args) {

        StrategyClient strategyClient = new StrategyClient();

        List<Document> documentList = List.of(
                DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.PRESIGN),
                DocumentCreator.documentBuildWithNumberAndStatus(2.0, Status.DRAFT),
                DocumentCreator.documentBuildWithNumberAndStatus(3.0, Status.SIGN)
        );

        strategyClient.setStrategy(new FinanceDocument());
        strategyClient.executeStrategy(documentList);

        strategyClient.setStrategy(new ManagementDocument());
        strategyClient.executeStrategy(documentList);

    }

}
