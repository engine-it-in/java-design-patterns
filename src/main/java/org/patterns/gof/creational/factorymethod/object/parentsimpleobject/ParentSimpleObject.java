package org.patterns.gof.creational.factorymethod.object.parentsimpleobject;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

public class ParentSimpleObject implements SimpleObject {
    @Override
    public void open() {
        System.out.println(String.format("Open %s", this.getClass().getCanonicalName()));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
