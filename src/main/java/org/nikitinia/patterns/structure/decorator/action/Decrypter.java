package org.nikitinia.patterns.structure.decorator.action;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.decorator.dictionary.TypeSecurity;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

/*
 * Что -> Класс, реализующий декорируемое поведение. Логика шифрования;
 * Для чего -> Выполнение конкретных действий;
 * Реализация -> Класс, наследующий базовое поведение декоратора;
 * В чем выгода -> Добавление функциональности декорируемому объекту;
 * */
@Slf4j
public class Decrypter extends Decorator {

    public Decrypter(Sender sender) {
        super(sender);
    }

    public String decrypt(SecurityDocument document) {
        log.info("Start decrypt document number {}", document.getNumber());
        document.setTypeSecurity(TypeSecurity.DECRYPT.getValue());
        log.info("End decrypt document number {}", document.getNumber());
        return String.format(" Document number %.0f - %s;", document.getNumber(), document.getTypeSecurity());

    }

    @Override
    public String send(SecurityDocument document) {
        return String.join("", super.send(document), decrypt(document));
    }
}
