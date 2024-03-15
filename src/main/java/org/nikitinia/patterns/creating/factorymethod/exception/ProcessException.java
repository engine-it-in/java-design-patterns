package org.nikitinia.patterns.creating.factorymethod.exception;

/**
 * Что -> Обработка возможных ошибок;
 * Для чего -> Реализация собственного класса исключений для возможности переопределения логики и сигнатуры работы с общим классом;
 * Реализация -> Класс исключения, наследованный от Runtime;
 * В чем выгода -> Регламентация работы с ошибками;
 */
public class ProcessException extends RuntimeException {
    public ProcessException(String message) {
        super(message);
    }
}
