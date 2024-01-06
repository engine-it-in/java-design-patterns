package org.nikitinia.patterns.behavior.chainofresponsobility.dictionary;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeSystem {


    TELEGRAM("Telegram"),
    EMAIL("Email"),
    SMS("SMS");

    final String system;
}
