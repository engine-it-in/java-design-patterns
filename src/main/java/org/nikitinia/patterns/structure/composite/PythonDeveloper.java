package org.nikitinia.patterns.structure.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        log.info("Python Developer write Code");
    }
}
