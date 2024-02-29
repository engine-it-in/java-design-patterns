package org.nikitinia.exception;

/*
 * Что -> Класс обработчик исключительных ситуаций;
 * Для чего -> Для обработки возможных проблем в коде;
 * Реализация -> Класс, наследуемый от общего класса ошибки, возникающей во время исполнения программы;
 * В чем выгода -> Обработка исключительных ситуаций;
 * */
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
