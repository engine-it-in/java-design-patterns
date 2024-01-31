package org.nikitinia.patterns.structure.facade;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
public record RecipientMobileDocument(

        String name,
        String surname,
        String patronymic,
        String address

) {
}
