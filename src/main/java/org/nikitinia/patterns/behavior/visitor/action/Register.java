package org.nikitinia.patterns.behavior.visitor.action;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;

import java.util.HashMap;

/**
 * Что -> Класс, реализующий определенную функцию для каждого из рабочих объектов ;
 * Для чего -> Инкапсуляция конкретного действия в едином объекте;
 * Реализация -> Класс с имплементацией интерфейса визитера;
 * В чем выгода -> Единый компонент обработки добавляемой логики;
 */
@Getter
public class Register implements Visitor {

    private final HashMap<String, Document> registerMap
            = new HashMap<>();


    @Override
    public void visit(FinanceDocument financeDocument) {
        registerMap.put(financeDocument.getId(), financeDocument.getDocument());
    }

    @Override
    public void visit(ManagementDocument managementDocument) {
        registerMap.put(managementDocument.getId(), managementDocument.getDocument());
    }

    @Override
    public void visit(PayDocument payDocument) {
        registerMap.put(payDocument.getId(), payDocument.getDocument());
    }

}
