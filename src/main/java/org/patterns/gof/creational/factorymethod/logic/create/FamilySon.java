package org.patterns.gof.creational.factorymethod.logic.create;

import org.patterns.gof.creational.factorymethod.logic.collect.Supplier;
import org.patterns.gof.creational.factorymethod.object.childsimpleobject.SonSimpleObject;
import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

/**
 * Create son family
 * */
public class FamilySon extends Supplier {

    /**
     * @return daughter object
     * @see SonSimpleObject
     * */
    @Override
    public SimpleObject createObject() {
        return new SonSimpleObject();
    }

}
