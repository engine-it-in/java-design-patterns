package org.nikitinia.patterns.behavior.state.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;
import org.nikitinia.patterns.behavior.state.actor.DocumentStart;
import org.nikitinia.patterns.behavior.state.action.DocumentContext;

public class Program {

    public static void main(String[] args) {
        /*Создаем рабочий документ*/
        Document document = DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.DRAFT);
        /*Инициируем первичное состояние*/
        DocumentActivity documentActivity = new DocumentStart(document);
        /*Передаем состояние в рабочий посредник*/
        DocumentContext documentContext = new DocumentContext(document);
        /*Устанавливаем возможность работы с состояниями*/
        documentContext.setDocumentActivity(documentActivity);

        /*Логика смены состояний требуемое количество раз*/
        for (int i = 0; i < 10; i++) {
            documentContext.doAction();
            documentContext.changeAction();
        }

        /*Реестр документа*/
        documentActivity.printRegisterDocumentsHistory();

    }

}
