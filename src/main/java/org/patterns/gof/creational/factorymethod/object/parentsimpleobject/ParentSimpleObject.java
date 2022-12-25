package org.patterns.gof.creational.factorymethod.object.parentsimpleobject;

import lombok.NoArgsConstructor;
import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

/**
 * Simple object Parent
 * Realized open/closed principle (sOlid)
 */
@NoArgsConstructor
public class ParentSimpleObject implements SimpleObject {

    /**
     * @return Type name class
     */
    public String getTypeName() {
        return this.getClass().getTypeName();
    }

    /**
     * @return Simple name class
     */
    public String getSimpleName() {
        return this.getClass().getSimpleName();
    }

    /**
     * Print that object open
     */
    @Override
    public void open() {
        System.out.println(
                String.format("Open %s", getSimpleName()));
    }

}
