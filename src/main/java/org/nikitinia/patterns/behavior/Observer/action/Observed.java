package org.nikitinia.patterns.behavior.Observer.action;

public interface Observed {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String action);

}
