package org.nikitinia.patterns.behavior.observer.run;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.observer.actor.Office;
import org.nikitinia.patterns.behavior.observer.actor.Subscriber;

public class Program {

    public static void main(String[] args) {
        Office office = new Office();

        Subscriber subscriberFirst = new Subscriber("Dima");
        Subscriber subscriberSecond = new Subscriber("Vova");

        office.addObserver(subscriberFirst);
        office.addObserver(subscriberSecond);

        office.addDocument(new Document());
        office.addDocument(new Document());

        office.removeObserver(subscriberSecond);

        office.removeDocument(new Document());

    }

}
