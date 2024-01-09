package org.nikitinia.patterns.behavior.visitor.action;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;

import java.util.ArrayList;
import java.util.List;

/*
 * Что -> Класс, реализующий определенную функцию для каждого из рабочих объектов ;
 * Для чего -> Инкапсуляция конкретного действия в едином объекте;
 * Реализация -> Класс с имплементацией интерфейса визитера;
 * В чем выгода -> Единый компонент обработки добавляемой логики;
 * */
@Getter
public class Converter implements Visitor {

    private final List<Document> converterList
            = new ArrayList<>();

    @Override
    public void visit(FinanceDocument financeDocument) {
        System.out.println("FinanceDocument" + " : " + financeDocument.getId() + " convert to regular document");
        converterList.add(financeDocument.getDocument());
    }

    @Override
    public void visit(ManagementDocument managementDocument) {
        System.out.println("ManagementDocument" + " : " + managementDocument.getId() + " convert to regular document");
        converterList.add(managementDocument.getDocument());
    }

    @Override
    public void visit(PayDocument payDocument) {
        System.out.println("PayDocument" + " : " + payDocument.getId() + " convert to regular document");
        converterList.add(payDocument.getDocument());
    }
}
