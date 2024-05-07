package org.nikitinia.patterns.creating.abstractfactory.action;

import org.nikitinia.domain.model.documents.Diploma;

/**
 * Что -> Интерфейс сертификации;
 * Для чего -> Контракт действий одного из объектов абстрактной фабрики;
 * Реализация -> Интерфейс;
 * Ценность -> Регламентация объекта, который будет возвращен в числе результирующих объектов абстрактной фабрики;
 */
public interface Certify {

    Diploma getDocument();
}
