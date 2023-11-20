package org.nikitinia.patterns.behavior.templatemethod.creators;

import org.nikitinia.domain.objects.Document;
import org.nikitinia.patterns.behavior.templatemethod.action.Creator;

public abstract class DocumentCreator implements Creator {
    private final Document document;

    public DocumentCreator(Document document) {
        this.document = document;
    }

    @Override
    public Document createDocument() {
        System.out.println("*");
        System.out.println("--Start--");
        showLink(document);
        System.out.println("--Finish--");
        System.out.println("*");
        return document;
    }
    public abstract void showLink(Document document);
}