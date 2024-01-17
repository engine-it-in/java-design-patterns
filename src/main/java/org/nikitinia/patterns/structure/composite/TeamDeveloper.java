package org.nikitinia.patterns.structure.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TeamDeveloper implements Developer {

    List<Developer> developerList = new ArrayList<>();

    void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    void removeDeveloper(Developer developer) {
        developerList.remove(developer);
    }

    @Override
    public void writeCode() {
        log.info("Start");
        developerList.forEach(Developer::writeCode);
    }

}
