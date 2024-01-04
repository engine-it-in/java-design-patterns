package org.nikitinia.patterns.behavior.templatemethod.action;

import org.nikitinia.domain.model.documents.Document;

/*
 * Что -> Выделение общего алгоритма работы шаблонного метода;
 * Для чего -> Инкапсуляция результатов работы алгоритма в единый компонент;
 * Реализация -> Интерфейс;
 * В чем выгода -> Регламентация работы шаблона;
 * */
public interface Creator {
    Document createDocument();

}
