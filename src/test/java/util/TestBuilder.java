package util;

import org.patterns.gof.behavior.factorymethod.logic.collect.Supplier;
import org.patterns.gof.behavior.factorymethod.logic.create.FamilyDaughter;
import org.patterns.gof.behavior.factorymethod.logic.create.FamilySon;
import org.patterns.gof.behavior.factorymethod.logic.create.GrandFamily;
import org.patterns.gof.behavior.factorymethod.object.childsimpleobject.DaughterSimpleObject;
import org.patterns.gof.behavior.factorymethod.object.childsimpleobject.SonSimpleObject;
import org.patterns.gof.behavior.factorymethod.object.parentsimpleobject.ParentSimpleObject;
import org.patterns.gof.behavior.factorymethod.object.simpleobject.SimpleObject;

public class TestBuilder {

    public SimpleObject fabricPrepareObject(SimpleObject simpleObject) {
        if (simpleObject instanceof ParentSimpleObject)
            return new ParentSimpleObject();
        else if (simpleObject instanceof SonSimpleObject)
            return new SonSimpleObject();
        else if (simpleObject instanceof DaughterSimpleObject)
            return new DaughterSimpleObject();
        return null;
    }

    public Supplier fabricPrepareFamily(Supplier supplier) {
        if (supplier instanceof GrandFamily)
            return new GrandFamily();
        else if (supplier instanceof FamilySon)
            return new FamilySon();
        else if (supplier instanceof FamilyDaughter)
            return new FamilyDaughter();
        return null;
        }


    }

