package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Что -> Класс снимок, реализующий логику работы с объеком. В нашем случае мы пользуемся документами;
 * Для чего -> В классе снимке мы используем целевой объект и реализуем логику работы с снимками.
 * В данном случае это добавление/доставание элемента из очереди, которая служит историей работы со снимком;
 * Реализация -> Класс, в котором мы реализуем работы с объектом, снимок которого хотим сделать;
 * В чем выгода -> Возможность управлять состоянием переданного объекта;
 * */
public class Memento {

    Queue<Document> mementoHistory = new LinkedList<>();

    @Getter
    private final Document document;

    public Memento(Document document) {
        this.document = document;
    }

    public void pushHistory(Document document) {
        mementoHistory.add(document);
    }

    public Document pollHistory() {
        return mementoHistory.poll();
    }
}
