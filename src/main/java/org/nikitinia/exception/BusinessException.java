package org.nikitinia.exception;

/**
 * Что -> Класс обработчик исключительных ситуаций;
 * Для чего -> Для обработки возможных проблем в коде;
 * Реализация -> Класс, наследуемый от общего класса ошибки, возникающей во время исполнения программы;
 * Ценность -> Обработка исключительных ситуаций;
 */
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
