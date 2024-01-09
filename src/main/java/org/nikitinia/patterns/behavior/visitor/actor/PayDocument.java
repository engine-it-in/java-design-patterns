package org.nikitinia.patterns.behavior.visitor.actor;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.visitor.Acceptor;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

/*
 * Что -> Рабочий объект, который реализует действия, через имплементацию интерфейса, в котором визитер обрабатывает в конкретном методе;
 * Для чего -> Конкретный класс, реализующий конкретную логику;
 * Реализация -> Класс с имплементацией интерфейса;
 * В чем выгода -> Класс, с конкретной ответсвенностью;
 * */
@AllArgsConstructor
@Getter
public class PayDocument implements Acceptor {

    private String id;
    private Document document;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
