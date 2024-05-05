package org.nikitinia.patterns.creating.prototype.logic;

import org.nikitinia.patterns.creating.prototype.actor.PatternDocument;
import org.nikitinia.patterns.creating.prototype.actor.DocumentFactory;

public class Program {

    public static void main(String[] args) {

        PatternDocument patternDocumentFirst = new PatternDocument("document");
        System.out.println(patternDocumentFirst);

        DocumentFactory documentFactory = new DocumentFactory(patternDocumentFirst);
        System.out.println(documentFactory.cloneShape());
    }

}
