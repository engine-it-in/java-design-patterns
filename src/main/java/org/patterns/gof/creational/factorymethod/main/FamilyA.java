package org.patterns.gof.creational.factorymethod.main;

import org.patterns.gof.creational.factorymethod.logic.Supplier;
import org.patterns.gof.creational.factorymethod.object.childsimpleobject.DaughterSimpleObject;
import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

public class FamilyA extends Supplier {

    @Override
    public SimpleObject createObject() {
        return new DaughterSimpleObject();
    }

}
