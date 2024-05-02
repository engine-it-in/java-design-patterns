package org.nikitinia.patterns.structure.facade.actor;

import lombok.Builder;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

/**
 * Что -> Новая сущность, используемая в нашей программе. Это получатель мобильного документа с заданными атрибутами;
 * Для чего -> Сущность, необходимая для выполнения задания;
 * Реализация -> Отдельный класс с переопределенным методом tpString(), которая позволит записывать в лог содержимое класса;
 * Ценность -> Локализованная отдельная ответсвенность;
 */
@Builder
public record RecipientMobileDocument(

        String name,
        String surname,
        String patronymic,
        TypeMobile typeMobile

) {
    @Override
    public String toString() {
        return "RecipientMobileDocument{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", typeMobile=" + typeMobile +
                '}';
    }
}
