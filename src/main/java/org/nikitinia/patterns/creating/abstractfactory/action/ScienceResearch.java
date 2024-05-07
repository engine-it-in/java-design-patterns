package org.nikitinia.patterns.creating.abstractfactory.action;

import org.nikitinia.domain.model.documents.ScientificWork;

/**
 * Что -> Интерфейс выполнения научной работы;
 * Для чего -> Контракт действий одного из объектов абстрактной фабрики;
 * Реализация -> Интерфейс;
 * Ценность -> Регламентация объекта, который будет возвращен в числе результирующих объектов абстрактной фабрики;
 */
public interface ScienceResearch {

    ScientificWork getWork();
}
