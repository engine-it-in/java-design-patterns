package org.nikitinia.patterns.structure.decorator.actor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.dictionarys.Type;
import org.nikitinia.domain.model.additional.TextField;
import org.nikitinia.domain.model.documents.Document;

import java.util.Arrays;


/**
 * Что -> Основной объект класса;
 * Для чего -> Выполнение шифрования документа;
 * Реализация -> Класс, наследующий документ и добавляющий ему атрибут декорации;
 * Ценность -> Наследование класса и добавление ему основных параметров;
 */
@Getter
@Setter
public class SecurityDocument extends Document {

    private String typeSecurity;

    private Document document;


    public SecurityDocument(Document document, String typeSecurity) {
        super(document.getNumber(), document.getSignatory(), document.getStatus(), document.getType(), document.getTextField());
        this.typeSecurity = typeSecurity;
    }
}
