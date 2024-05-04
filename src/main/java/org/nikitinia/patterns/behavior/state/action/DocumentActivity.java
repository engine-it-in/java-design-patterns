package org.nikitinia.patterns.behavior.state.action;


/**
 * Что -> Интерфейс, регламентирующий активность состояния документа;
 * Для чего -> Регламентация действий с документом;
 * Реализация -> Интерфейс;
 * Ценность -> Для каждого состояния мы запускаем конкретные действия;
 */
public interface DocumentActivity {
    void doAction();
    void printRegisterDocumentsHistory();
}
