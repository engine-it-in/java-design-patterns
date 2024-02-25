package org.nikitinia.patterns.structure.proxy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class WordForm implements PrintForm {

    private Double documentNumber;

    private void loadDocument() {
        log.info("Loading document");
    }

    @Override
    public void display() {
        log.info("Display document");
    }
}
