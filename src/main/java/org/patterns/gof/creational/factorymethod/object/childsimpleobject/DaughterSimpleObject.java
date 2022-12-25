package org.patterns.gof.creational.factorymethod.object.childsimpleobject;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

/**
 * Simple object Daughter
 * Realized open/closed principle (sOlid)
 */
public class DaughterSimpleObject implements SimpleObject {

    /**
     * Get name of an object
     */
    public String getSimpleName() {
        return this.getClass().getSimpleName();
    }

    /**
     * Do some open and print simple name
     */
    @Override
    public void open() {
        System.out.println(String.format("Open %s", getSimpleName()));
    }


}
