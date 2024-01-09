package org.nikitinia.patterns.behavior.visitor.visitor;

/*
 * Что -> Интерфейс, который инкапсулирует логику работы визитера в отдельный контракт;
 * Для чего -> Унификация действий, которые могут добавляться в конкретного объекта;
 * Реализация -> Интерфейс, с единым методом, для которого в качестве входного параметра используется интерфейс визитера;
 * В чем выгода -> Работа с объектами через общий интерфейс;
 * */
public interface Acceptor {

    void accept(Visitor visitor);

}
