package org.nikitinia.patterns.behavior.visitor.action;


import org.nikitinia.patterns.behavior.visitor.actor.FinanceDocument;
import org.nikitinia.patterns.behavior.visitor.actor.ManagementDocument;
import org.nikitinia.patterns.behavior.visitor.actor.PayDocument;

/*
 * Что -> Интерфейс визитера, который работает с добавленными объектами;
 * Для чего -> Работа с интерфейсом проходит через объъекты, для которых логика может изменяться;
 * Реализация -> Интерфейс, в котором столько методов, сколько рабочих объектов у нас есть;
 * В чем выгода -> Единый компонент обработки объектов;
 * */
public interface Visitor {

    void visit(FinanceDocument financeDocument);

    void visit(ManagementDocument managementDocument);

    void visit(PayDocument payDocument);

}
