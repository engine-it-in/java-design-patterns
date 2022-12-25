package org.patterns.gof.creational.factorymethod.logic.create;

import org.patterns.gof.creational.factorymethod.logic.collect.Supplier;
import org.patterns.gof.creational.factorymethod.object.childsimpleobject.DaughterSimpleObject;
import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

/**
 * Create daughter family
 * */
public class FamilyDaughter extends Supplier {

    /**
     * @return daughter object
     * @see DaughterSimpleObject
     * */
    @Override
    public SimpleObject createObject() {
        return new DaughterSimpleObject();
    }

}
