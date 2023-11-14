package org.nikitinia.patterns.behavior.Observer.actor;

import org.nikitinia.domain.objects.Document;
import org.nikitinia.patterns.behavior.Observer.action.Observed;
import org.nikitinia.patterns.behavior.Observer.action.Observer;

import java.util.ArrayList;
import java.util.List;

public class Office implements Observed {

    private final List<Document> documents = new ArrayList<>();

    private final List<Observer> subscribes = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribes.remove(observer);
    }

    @Override
    public void notifyObserver(String action) {
        for (Observer observer: subscribes) {
            observer.eventListener(documents, action);
        }
    }

    public void addDocument(Document document) {
        documents.add(document);
        notifyObserver("add");
    }

    public void removeDocument(Document document) {
        documents.remove(document);
        notifyObserver("remove");
    }

}