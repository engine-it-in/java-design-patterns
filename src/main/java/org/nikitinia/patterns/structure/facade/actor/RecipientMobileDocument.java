package org.nikitinia.patterns.structure.facade.actor;

import lombok.Builder;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

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
