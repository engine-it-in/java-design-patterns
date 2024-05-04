package org.nikitinia.patterns.behavior.state.action;

import lombok.Setter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;
import org.nikitinia.patterns.behavior.state.actor.DocumentStart;
import org.nikitinia.patterns.behavior.state.actor.DocumentStop;


/**
 * Что -> Класс, реализующий работу с состояниями объекта через интерфейс;
 * Для чего -> Посредник, для работы с состояниями;
 * Реализация -> Класс, агрегирующий интерфейс работы с состояниями;
 * Ценность -> Запуск смены состояний;
 */
public class DocumentContext {

    public Document document;

    @Setter
    public DocumentActivity documentActivity;

    public DocumentContext(Document document) {
        this.document = document;
    }


    public void doAction() {
        documentActivity.doAction();
    }

    public void changeAction() {
        if (documentActivity instanceof DocumentStart) {
            setDocumentActivity(new DocumentStop(document));
        } else if (documentActivity instanceof DocumentStop) {
            setDocumentActivity(new DocumentStart(document));
        }
    }

}
