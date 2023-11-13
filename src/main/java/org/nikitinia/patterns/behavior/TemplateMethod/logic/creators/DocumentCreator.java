package org.nikitinia.patterns.behavior.TemplateMethod.logic.creators;

import org.nikitinia.domain.Document;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.action.Creator;

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