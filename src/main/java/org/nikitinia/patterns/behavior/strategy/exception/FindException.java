package org.nikitinia.patterns.behavior.strategy.exception;

/*
 * Что -> Класс реализующий требуемую обработку исключения;
 * Для чего -> Локализация логики обработки исключения;
 * */
public class FindException extends RuntimeException{
    public FindException() {
        super("Do not find that exactly need");
    }
}
