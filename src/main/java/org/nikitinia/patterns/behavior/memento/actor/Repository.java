package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.memento.actor.Memento;

import java.util.Stack;

@Getter
@Setter
public class Repository {

    Stack<Document> documentHistory;

    private Memento memento;

    private void addHistory(Document document) {
        documentHistory.add(document);
    }

    private Document peekHistory() {
        return documentHistory.peek();
    }

}
