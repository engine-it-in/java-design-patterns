package org.nikitinia.patterns.structure.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TypeSecurity {

    ENCRYPT("encrypt"),

    DECRYPT("decrypt");

    final String value;

}
