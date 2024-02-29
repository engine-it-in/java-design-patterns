package org.nikitinia.patterns.behavior.chainofresponsobility.action;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.actor.Activity;

/*
 * Что -> Метод, выполняемый для каждого звена цепочки;
 * Для чего -> Унификация и регламентация общих действий;
 * Реализация -> Интерфейс с общей сигнатурой;
 * В чем выгода -> Удобство реализации и манипулирования конкретными классами исполнителями;
 * */
public interface PublicDocument {

    void publicity(Document document, Activity activity);

}
