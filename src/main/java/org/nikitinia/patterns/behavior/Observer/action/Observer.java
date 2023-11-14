package org.nikitinia.patterns.behavior.Observer.action;

import org.nikitinia.domain.objects.Document;

import java.util.List;

public interface Observer {

    void eventListener(List<Document> documents, String action);

}
