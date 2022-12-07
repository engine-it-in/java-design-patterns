package org.patterns.gof.creational.factorymethod.kindsimpleobject;

import org.patterns.gof.creational.factorymethod.simpleobject.SimpleObject;

public class SonSimpleObject implements SimpleObject {
    @Override
    public void open() {
        System.out.printf("I'm %s", this.getClass().getSimpleName());
    }

}
