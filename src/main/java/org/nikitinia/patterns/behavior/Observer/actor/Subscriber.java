package org.nikitinia.patterns.behavior.Observer.actor;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.objects.Document;
import org.nikitinia.patterns.behavior.Observer.action.Observer;

import java.util.List;

@AllArgsConstructor
public class Subscriber implements Observer {

    private int id;

    private String name;


    @Override
    public void eventListener(List<Document> documents, String action) {
        System.out.println(name + " " + documents + " " + action);
    }
}
