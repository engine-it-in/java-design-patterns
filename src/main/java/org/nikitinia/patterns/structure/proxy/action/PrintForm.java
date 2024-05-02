package org.nikitinia.patterns.structure.proxy.action;

/**
 * Что -> Закрепление контракта основного и прокси классов;
 * Для чего -> Типизация операций;
 * Реализация -> Интерфейс с основным рабочим методом;
 * Ценность -> Удобство инстанциирования и работы с классами;
 */
public interface PrintForm {
    void display();
}
