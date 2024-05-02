package org.nikitinia.patterns.structure.composite.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;

/**
 * Что -> Общий абстрактный класс с общей логикой работы с конкретным документом;
 * Для чего -> Инкапсуляций общей логики в единый компонент;
 * Реализация -> Абстрактный класс с одним атрибутом и конструктором;
 * Ценность -> Уменьшение дублирования кода;
 */
@AllArgsConstructor
@Getter
public abstract class MainDocument {

    private final Document document;

}
