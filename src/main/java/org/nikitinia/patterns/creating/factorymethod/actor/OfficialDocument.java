package org.nikitinia.patterns.creating.factorymethod.actor;

/**
 * Что -> Оповещение для конкретного типа документа;
 * Для чего -> Реализация требуемой логики;
 * Реализация -> Конкретный класс, имплементирующий интерфейс и наследующий логику по умолчанию;
 * В чем выгода -> Регламентация типа класса и переопределение требуемой логики;
 */
public class OfficialDocument implements Document {
}