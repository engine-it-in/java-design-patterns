package org.nikitinia.patterns.behavior.chainofresponsibility.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.patterns.behavior.chainofresponsibility.dictionary.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsibility.action.PublicDocument;


/**
 * Что -> Описание общей логики каждого звена цепочки;
 * Для чего -> Задание общих арибутов и общего поведения, необходимого для реализации шаблона;
 Каждый инстанс общего объекта будет содержать ссылку на следующий метод. Если для логики исполнения наличия
 следующего звена цепочки будет необходимо, то использование абстрактного класса позволит реализовать это
 по умолчанию;
 * Реализация -> Абстрактный класс с имплементацией общего интерфейса;
 * Ценность -> Шаблонизированное представление класса обработчика действий;
 */
@Getter
@Setter
public abstract class Activity implements PublicDocument {

    private final Priority priority;

    PublicDocument next;

    public Activity(Priority priority) {
        this.priority = priority;
    }


    @Override
    public void publicity(Document document, Activity activity) {
        if (activity.getPriority().getLevel() <= priority.getLevel()) {
            writeDocument(document);
        }
        if (next != null) {
            next.publicity(document, activity);
        }
    }

    public abstract void writeDocument(Document document);

}
