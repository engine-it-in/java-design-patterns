package org.nikitinia.patterns.behavior.strategy.actor;

import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.strategy.action.Sorting;
import org.nikitinia.patterns.behavior.strategy.exception.FindException;

import java.util.Comparator;
import java.util.List;

/**
 * Что -> Реализация логики стратегического действия;
 * Для чего -> Конкретная реализация;
 * Реализация -> Класс с имплементацией интерфейса стратегии;
 * Ценность -> Конкретная реализация действия;
 */
public class ManagementDocument implements Sorting {

    @Override
    public void findDocument(List<Document> documentList) {
        Document documentResult = documentList.stream()
                .filter(document -> document.getStatus().equals(Status.DRAFT))
                .min(Comparator.naturalOrder())
                .orElseThrow(FindException::new);

        System.out.println(documentResult.getNumber());

    }
}
