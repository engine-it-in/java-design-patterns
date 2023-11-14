package org.nikitinia.patterns.behavior.Observer.run;

import org.nikitinia.domain.objects.Document;
import org.nikitinia.patterns.behavior.Observer.actor.Office;
import org.nikitinia.patterns.behavior.Observer.actor.Subscriber;

public class Program {

    public static void main(String[] args) {
        Office office = new Office();

        Subscriber subscriberFirst = new Subscriber(1, "Dima");
        Subscriber subscriberSecond = new Subscriber(2, "Vova");

        office.addObserver(subscriberFirst);
        office.addObserver(subscriberSecond);

        office.addDocument(new Document());
        office.addDocument(new Document());

        office.removeObserver(subscriberSecond);

        office.removeDocument(new Document());

    }

}
