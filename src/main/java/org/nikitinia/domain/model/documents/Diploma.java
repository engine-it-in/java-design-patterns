package org.nikitinia.domain.model.documents;

import lombok.Builder;

import java.util.List;

@Builder
public record Diploma(

        Integer number,

        Integer averageRate,

        List<String> subjects

) {
}
