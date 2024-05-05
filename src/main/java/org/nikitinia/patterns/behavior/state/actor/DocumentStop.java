package org.nikitinia.patterns.behavior.state.actor;

import lombok.Getter;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;

/**
 * Что -> Класс состояние, который наследует и выполняет логику асбстрактного класса и реализует конкретное поведение по смене статуса;
 * Для чего -> Реализация требуемого поведения;
 * Реализация -> Класс;
 * Ценность -> Конкретная ответсвенность, конкретного исполнителя;
 */
@Getter
public class DocumentStop extends DocumentState implements DocumentActivity {

    public Document document;

    public DocumentStop(Document document) {
        super(document);
    }

    @Override
    public void doAction() {
        addDocument();
        modifyDocumentStatus(Status.SIGN);
        notifyDocumentStatus();
    }

}