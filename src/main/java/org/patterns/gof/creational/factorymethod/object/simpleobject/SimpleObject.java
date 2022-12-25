package org.patterns.gof.creational.factorymethod.object.simpleobject;

/**
 * General interface realized purpose of objects
 * Realized single responsibility and Interface segregation (SolId)
 */
public interface SimpleObject {

    /**
     * Default method open object
     */
    default void open() {
        System.out.println("Open it!");
    }

}
