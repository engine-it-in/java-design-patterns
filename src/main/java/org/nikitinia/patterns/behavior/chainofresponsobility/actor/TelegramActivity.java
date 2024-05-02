package org.nikitinia.patterns.behavior.chainofresponsobility.actor;

import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.TypeSystem;


/**
 * Что -> Класс, звено в последовательности цепочки обязанности;
 * Для чего -> Реализация исполнения конкретного поведения;
 * Реализация -> Класс потомок абстрактного класса;
 * Ценность -> Реализация общего поведения за счет абстрактного класса,
 реализация конкретной ответсвенности в конкретном месте;
 */
public class TelegramActivity extends Activity {

    public TelegramActivity(Priority priority) {
        super(priority);
    }

    @Override
    public void writeDocument(Document document) {
        System.out.println(TypeSystem.TELEGRAM.getSystem() + " : " + document);
    }
}
