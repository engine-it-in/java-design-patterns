package org.nikitinia.patterns.behavior.observer.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.observer.actor.Office;
import org.nikitinia.patterns.behavior.observer.actor.Subscriber;

public class Program {

    public static void main(String[] args) {
        /*Издатель*/
        Office office = new Office();
        /*Подписчики*/
        Subscriber subscriberFirst = new Subscriber("Dima");
        Subscriber subscriberSecond = new Subscriber("Vova");
        /*Добавление подписчиков*/
        office.addObserver(subscriberFirst);
        office.addObserver(subscriberSecond);
        /*Документы, которые должны быть доступны по подписке*/
        Document documentFirst = DocumentCreator.documentBuildWithNumber(1.0);
        Document documentSecond = DocumentCreator.documentBuildWithNumber(2.0);
        /*Добавление документов к издателю -> оповещение подписчиков*/
        office.addDocument(documentFirst);
        office.addDocument(documentSecond);
        /*Отписка подписчика*/
        office.removeObserver(subscriberSecond);
        /*Уведомление оставшегося подписчика о выполненном действии*/
        office.removeDocument(documentFirst);
    }

}
