package org.patterns.gof.creational.factorymethod.sonsimpleobject;

import org.patterns.gof.creational.factorymethod.simpleobject.SimpleObject;

public class FirstSonSimpleObject implements SimpleObject {
    @Override
    public void open() {
        System.out.printf("I'm %s", this.getClass().getSimpleName());
    }
}
