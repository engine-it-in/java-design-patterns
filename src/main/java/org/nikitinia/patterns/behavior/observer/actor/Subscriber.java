package org.nikitinia.patterns.behavior.observer.actor;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.observer.action.Observer;

import java.util.List;

@AllArgsConstructor
public class Subscriber implements Observer {

    private String name;

    @Override
    public void eventListener(List<Document> documents, String action) {
        System.out.println(name + " " + documents + " " + action);
    }
}
