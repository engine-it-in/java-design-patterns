package org.nikitinia.patterns.creating.singleton.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.creating.singleton.action.Singleton;

public class Program {

    public static void main(String[] args) {
        Document documentFirst = DocumentCreator.documentBuildWithNumber(1.0);
        Singleton singleton = Singleton.getInstance(documentFirst);
        System.out.println(singleton);

        Document documentSecond = DocumentCreator.documentBuildWithNumber(2.0);
        Singleton singletonFirst = Singleton.getInstance(documentSecond);
        System.out.println(singletonFirst);
    }

}
