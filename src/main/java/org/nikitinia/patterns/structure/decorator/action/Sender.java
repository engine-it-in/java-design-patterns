package org.nikitinia.patterns.structure.decorator.action;

import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

/*
 * Что -> Интерфейс декорирования;
 * Для чего -> Контракт на действия, которые будут "декорироваться";
 * Реализация -> Интерфейс;
 * В чем выгода -> Возможность управления поведением;
 * */
public interface Sender {

    String send(SecurityDocument document);

}
