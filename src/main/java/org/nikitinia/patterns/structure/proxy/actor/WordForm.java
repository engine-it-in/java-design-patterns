package org.nikitinia.patterns.structure.proxy.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.proxy.action.PrintForm;

/*
 * Что -> Основной класс задания - форма документа;
 * Для чего -> Реализация логики;
 * Реализация -> Класс с имплементацией интерфейса;
 * В чем выгода -> Реализация логики;
 * */
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
