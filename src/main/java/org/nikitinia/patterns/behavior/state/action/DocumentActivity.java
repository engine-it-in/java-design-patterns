package org.nikitinia.patterns.behavior.state.action;


/**
 * Что -> Интерфейс, который регламентирует активность состояния документа.
 Запускается определенная работа и печатается история работы с реестром;
 * Для чего -> Регламентация действий с документом. Так как мы говорим о разных состояний, то работать с ними мы будет через интерфейс;
 * Реализация -> Интерфейс с необходимыми методы;
 * Ценность -> Полиморфизм. Нам не важно конкретное состояние. В каждом состоянии мы запускаем конкретные действия;
 */
public interface DocumentActivity {
    void doAction();
    void printRegisterDocumentsHistory();
}
