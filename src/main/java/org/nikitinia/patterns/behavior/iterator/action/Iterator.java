package org.nikitinia.patterns.behavior.iterator.action;

public interface Iterator<T> {

    boolean hasNext();

    T next();
}
