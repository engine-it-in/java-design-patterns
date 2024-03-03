package org.nikitinia.patterns.structure.decorator.action;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

/*
 * Что -> Класс, реализующий ядро декоратора. Класс имплементирует интерфейс, декорирующий метод, дополнение которого должно входить в ответсвенность декоратора;
 * Для чего -> Определение базового поведения декорирующих объектов;
 * Реализация -> Класс, имплементирующий контракт декорации;
 * В чем выгода -> Возможность наследования класса декорирующими потомками;
 * */
@AllArgsConstructor
public class Decorator implements Sender {

    private Sender sender;
    @Override
    public String send(SecurityDocument document) {
        return sender.send(document);
    }
}
