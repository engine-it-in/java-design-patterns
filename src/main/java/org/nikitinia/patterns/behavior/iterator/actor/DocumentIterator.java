package org.nikitinia.patterns.behavior.iterator.actor;

import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.iterator.action.Iterator;

import java.util.List;

/*
 * Что -> Конкретный итератор для работы с документами;
 * Для чего -> Определение логики перебора документов;
 * Реализация -> Класс, реализующий логику методов интерфейса итератора;
 * В чем выгода -> Элемент, поддерживающий SOLID принципы:
 * S - Единственная ответсвенность -> Реализация методов итератора для работы со структурой документов;
 * O - Открытость/закрытость -> При дополнении работы итератора, работа с документами будет дополняться;
 * L - Принцип подстановки Лисков -> Работаем с документами, но при необходимости в качестве документов можем работать с любим наследником класса документов;
 * I - Разделение интерфейсов -> Работаем с конкретным иинтерфейсом и только с ним, не перегружая приведенный итератор;
 * D - Класс зависит от абстракций и не зависит ни от чего конретного;
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
