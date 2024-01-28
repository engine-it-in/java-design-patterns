package org.nikitinia.patterns.structure.decorator.dictionary;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TypeSecurity {

    ENCRYPT("encrypt"),

    DECRYPT("decrypt");

    final String value;

}
