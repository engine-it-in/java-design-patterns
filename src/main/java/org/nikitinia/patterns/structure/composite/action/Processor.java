package org.nikitinia.patterns.structure.composite.action;

/*
 * Что -> Общий интерфейс для всех объектов иерархии композита;
 * Для чего -> Соглашение о выполняемых действий каждым объектом;
 * Реализация -> Интерфейс;
 * В чем выгода -> Регламентация поведения;
 * */
public interface Processor {

    void processing();

    void notifying();

}
