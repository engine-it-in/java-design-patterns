package org.nikitinia.patterns.structure.bridge.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

/**
 * Что -> Инкапсуляция и регламентация действий с документом;
 * Для чего -> Регламентация действий с документами;
 * Реализация -> Абстрактный класс, описывающий общее поведение;
 * Ценность -> Инкапсуляций необходимой ответсвенности, которая должна быть реализована в потомках;
 */
@Getter
@AllArgsConstructor
public abstract class DocumentAbstract {

    Interfaze interfaze;

    public abstract void createDocument(Document document);

}
