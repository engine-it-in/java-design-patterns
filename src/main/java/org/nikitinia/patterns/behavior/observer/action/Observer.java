package org.nikitinia.patterns.behavior.observer.action;

import org.nikitinia.domain.model.documents.Document;

import java.util.List;

public interface Observer {

    void eventListener(List<Document> documents, String action);

}
