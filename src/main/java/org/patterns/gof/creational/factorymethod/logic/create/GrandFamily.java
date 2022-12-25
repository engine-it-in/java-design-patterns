package org.patterns.gof.creational.factorymethod.logic.create;

import org.patterns.gof.creational.factorymethod.logic.collect.Supplier;
import org.patterns.gof.creational.factorymethod.object.parentsimpleobject.ParentSimpleObject;
import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

/**
 * Create grand family
 * */
public class GrandFamily extends Supplier {

    /**
     * @return Parent object
     * @see ParentSimpleObject
     * */
    @Override
    public SimpleObject createObject() {
        return new ParentSimpleObject();
    }

}
