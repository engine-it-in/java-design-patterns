package org.nikitinia.patterns.behavior.chainofresponsibility.action;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsibility.actor.Activity;

/**
 * Что -> Действие, выполняемое для каждого звена цепочки;
 * Для чего -> Унификация и регламентация ответственности звена цепочки;
 * Реализация -> Интерфейс с общим контрактом звена цепочки;
 * Ценность -> Удобство реализации и манипулирования конкретными классами исполнителями;
 */
public interface PublicDocument {

    void publicity(Document document, Activity activity);

}