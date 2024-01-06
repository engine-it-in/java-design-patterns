package org.nikitinia.domain.dictionarys;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Priority {

    NORMAL (3),
    VIP (2),
    CRITICAL (1);

    final int level;

}
