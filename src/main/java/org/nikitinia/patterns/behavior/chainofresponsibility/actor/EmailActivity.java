package org.nikitinia.patterns.behavior.chainofresponsibility.actor;

import lombok.Getter;
import org.nikitinia.patterns.behavior.chainofresponsibility.dictionary.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsibility.dictionary.TypeSystem;


/**
 * Что -> Звено в последовательности цепочки обязанностей;
 * Для чего -> Реализация конкретного поведения;
 * Реализация -> Класс потомок абстрактного класса;
 * Ценность -> Реализация общего поведения за счет абстрактного класса,
 реализация конкретной ответсвенности в конкретном месте;
 */
@Getter
public class EmailActivity extends Activity {

    public EmailActivity(Priority priority) {
        super(priority);
    }

    @Override
    public void writeDocument(Document document) {
        System.out.println(TypeSystem.EMAIL.getSystem() + " : " + document);
    }
}
