package org.patterns.gof.creational.factorymethod.object.childsimpleobject;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

public class SonSimpleObject implements SimpleObject {
    @Override
    public void open() {
        System.out.printf("I'm %s", this.getClass().getSimpleName());
    }

}
