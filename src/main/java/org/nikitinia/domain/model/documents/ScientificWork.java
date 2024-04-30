package org.nikitinia.domain.model.documents;

import lombok.Builder;

@Builder
public record ScientificWork(
        Integer number,

        String name,

        String subject,

        String typeScience

) {
}
