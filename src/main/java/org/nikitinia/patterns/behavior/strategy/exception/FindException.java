package org.nikitinia.patterns.behavior.strategy.exception;

public class FindException extends RuntimeException{
    public FindException() {
        super("Do not find that exactly need");
    }
}
