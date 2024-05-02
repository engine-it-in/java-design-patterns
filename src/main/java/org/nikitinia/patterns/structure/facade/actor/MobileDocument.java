package org.nikitinia.patterns.structure.facade.actor;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

/**
 * Что -> Мобильный документ. Новый класс, который в качестве атрибутов использует
традиционный документ и добавленный документ с конкретной мобильной информационной системой;
 * Для чего -> Используемая в обработка сущность;
 * Реализация -> В виде нового типа класса - рекорд, который является потокобезопасным и более лаконичным;
 * Ценность -> Новая сущность, которая позволяет не изменяя исходного класса работать с новым объектом, часть которого нужный нам класс;
 */
public record MobileDocument(
        Document document,
        TypeMobile typeMobile) {
}
