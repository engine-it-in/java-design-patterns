package org.nikitinia.patterns.behavior.iterator.logic;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.action.Iterator;

import java.util.List;

/*
* Это итератор документов. Здесь мы определяем структуру, над которой будем итерироваться и как будем итерироваться
* */
public class DocumentIterator implements Iterator {

    /*
    * Итерируемая коллекция
    * */
    @Getter
    private final List<Document> documentList;

    /*
    * Составное условие для итерирования
    * */
    @Getter
    private int position;

    /*
    * В конструкторе закрепляем условие определения позиции для итерирования и инстанциируем коллекцию для итерирования
    * */
    public DocumentIterator(List<Document> documentList) {
        this.position = 0;
        this.documentList = documentList;
    }

    /*
    * Итерироваться можно, пока не достигли конца
    * */
    @Override
    public boolean hasNext() {
        return position < documentList.size();
    }

    /*
    * Берем элемент,
    * перещелкиваем позицию, которая будет определять, какой элемент следующий,
    * печатаем содержимое документа
    * */
    @Override
    public Document next() {
        Document document = documentList.get(position);
        position++;
        System.out.println(document);
        return document;
    }

}
