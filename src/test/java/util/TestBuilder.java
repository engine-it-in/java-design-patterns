package util;

import org.patterns.gof.creational.factorymethod.object.childsimpleobject.DaughterSimpleObject;
import org.patterns.gof.creational.factorymethod.object.childsimpleobject.SonSimpleObject;
import org.patterns.gof.creational.factorymethod.object.parentsimpleobject.ParentSimpleObject;
import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

public class TestBuilder {

    public SimpleObject fabricPrepareObject(SimpleObject simpleObject) {

        if (simpleObject == null) return null;

        if (simpleObject instanceof ParentSimpleObject)
            return new ParentSimpleObject();
        else if (simpleObject instanceof SonSimpleObject)
            return new SonSimpleObject();
        else if (simpleObject instanceof DaughterSimpleObject)
            return new DaughterSimpleObject();

        return null;
    }

}
