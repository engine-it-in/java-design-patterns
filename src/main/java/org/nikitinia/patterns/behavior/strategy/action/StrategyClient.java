package org.nikitinia.patterns.behavior.strategy.action;

import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;

import java.util.List;

/*
 * Что -> Класс, реализующий взаимодействие с интерфейсом ;
 * Для чего -> Этому класса делегируется ответсвенность инкапсуляции стратегий;
 * Реализация -> Класс с агрегированием конкретного интерфейса;
 * В чем выгода -> Иам Мы выделяем самую изменяемую логику в отдельный и независимый компонент;
 * */
@Setter
public class StrategyClient {

    Sorting strategy;

    public void executeStrategy(List<Document> documentList) {
        strategy.findDocument(documentList);
    }

}
