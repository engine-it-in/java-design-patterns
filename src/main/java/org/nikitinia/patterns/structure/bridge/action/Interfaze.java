package org.nikitinia.patterns.structure.bridge.action;

import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Общий интерфейс, описывающий действия над документами;
 * Для чего -> Регламентация действий над документами;
 * Реализация -> Интерфейс;
 * Ценность -> Унификация действий;
 */
public interface Interfaze {

    Document loadDocument(Double id);

    void visualizeDocument(Double id);

}
