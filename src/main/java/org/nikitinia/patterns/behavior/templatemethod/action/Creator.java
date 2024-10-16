package org.nikitinia.patterns.behavior.templatemethod.action;

import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Выделение общего алгоритма работы;
 * Для чего -> Инкапсуляция результатов работы алгоритма в единый компонент;
 * Реализация -> Интерфейс;
 * Ценность -> Регламентация работы шаблона;
 */
public interface Creator {
    Document createDocument();

}
