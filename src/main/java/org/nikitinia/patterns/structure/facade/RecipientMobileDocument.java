package org.nikitinia.patterns.structure.facade;

import lombok.Builder;

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
