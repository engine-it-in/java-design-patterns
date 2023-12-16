package org.nikitinia.patterns.behavior.memento.run;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.memento.actor.DocumentEditor;
import org.nikitinia.patterns.behavior.memento.actor.Repository;

public class Program {

    public static void main(String[] args) {
        /*Создаем редактор документов*/
        DocumentEditor documentEditor = new DocumentEditor();
        /*Создаем репозиторий, через который будем работать о списком*/
        Repository repository = new Repository();

        /*Создаем документы*/
        Document documentFirst = DocumentCreator.documentBuildWithNumber(1.0);
        Document documentSecond = DocumentCreator.documentBuildWithNumber(2.0);

        /*Передаем редактору документов документ*/
        documentEditor.setDocument(documentFirst);
        /*Делаем снимок документа*/
        repository.setMemento(documentEditor.memento());

        /*Передаем редактору документов следующий документ*/
        documentEditor.setDocument(documentSecond);

        /*Загружаем в редактор снимок*/
        documentEditor.load(repository.getMemento());

    }

}
