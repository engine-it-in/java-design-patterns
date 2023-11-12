package org.patterns.behavior.TemplateMethod.logic;

import org.patterns.behavior.TemplateMethod.domain.Document;

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