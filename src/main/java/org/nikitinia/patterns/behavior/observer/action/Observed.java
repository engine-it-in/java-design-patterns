package org.nikitinia.patterns.behavior.observer.action;

public interface Observed {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String action);

}
