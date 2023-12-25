package org.nikitinia.patterns.behavior.state.actor;

import lombok.Getter;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;

/*
 * Что -> Конкретный класс состояние, который наследует и выполняет логику асбстрактного класа и реализует конкретное поведение по смене статуса.
 * Для чего -> Реализация требуемого поведения;
 * Реализация -> Класс;
 * В чем выгода -> Конкретная ответсвенность, конкретного исполнителя;
 */
@Getter
public class DocumentStart extends DocumentState implements DocumentActivity {

    public Document document;

    public DocumentStart(Document document) {
        super(document);
    }

    @Override
    public void doAction() {
        addDocument();
        modifyDocumentStatus(Status.PRESIGN);
        notifyDocumentStatus();
    }

}
