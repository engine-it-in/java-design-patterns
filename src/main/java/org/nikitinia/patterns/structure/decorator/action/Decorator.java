package org.nikitinia.patterns.structure.decorator.action;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

/**
 * Что -> Класс, реализующий ядро декоратора;
 * Для чего -> Определение базового поведения декорирующих объектов;
 * Реализация -> Класс, имплементирующий контракт декорации;
 * Ценность -> Возможность наследования класса декорирующими потомками;
 */
@AllArgsConstructor
public class Decorator implements Sender {

    private Sender sender;
    @Override
    public String send(SecurityDocument document) {
        return sender.send(document);
    }
}
