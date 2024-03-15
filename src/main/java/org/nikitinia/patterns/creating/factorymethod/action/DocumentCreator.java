package org.nikitinia.patterns.creating.factorymethod.action;

import org.nikitinia.patterns.creating.factorymethod.actor.Document;

/**
 * Что -> Интерфейс, который регламентирует работу по оповещению;
 * Для чего -> Общий контракт действий, которые будет реализовывать фабричный метод;
 * Реализация -> Интерфейс с реализацией по-умолчанию, которую можно будет переопределить;
 * В чем выгода -> Регламентация требуемого действия;
 */
public interface DocumentCreator {

    Document createDocument();

}
