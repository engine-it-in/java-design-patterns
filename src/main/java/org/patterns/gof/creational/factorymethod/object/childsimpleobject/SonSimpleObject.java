package org.patterns.gof.creational.factorymethod.object.childsimpleobject;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

public class SonSimpleObject implements SimpleObject {
    @Override
    public void open() {
        System.out.printf("Open %s", this.getClass().getCanonicalName());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
