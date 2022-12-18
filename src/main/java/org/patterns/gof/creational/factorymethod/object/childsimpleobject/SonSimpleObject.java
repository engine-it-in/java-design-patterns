package org.patterns.gof.creational.factorymethod.object.childsimpleobject;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

/*
* Simple object Son without constructor
* */
public class SonSimpleObject implements SimpleObject {

    /** Implemented method from interface */
    @Override
    public void open() {
        System.out.println(String.format("Open %s", this.getClass().getCanonicalName()));
    }

    /** Implemented method from Base interface */
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
