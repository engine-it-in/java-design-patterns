package org.nikitinia.patterns.structure.proxy.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.proxy.action.PrintForm;

@Slf4j
@AllArgsConstructor
@Getter
public class WordForm implements PrintForm {

    private Double documentNumber;

    @Override
    public void display() {
        log.info("Display document with number {}", documentNumber);
    }
}
