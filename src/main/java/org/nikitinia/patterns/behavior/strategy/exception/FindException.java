package org.nikitinia.patterns.behavior.strategy.exception;

/**
 * Что -> Класс реализующий требуемую обработку исключения;
 * Для чего -> Локализация логики обработки исключения;
 * Реализация -> Класс наследованный от Runtime exception;
 * Ценность -> Управляемое исключение;
 */
public class FindException extends RuntimeException {
    public FindException() {
        super("Do not find that exactly need");
    }
}
