package util;

import org.patterns.gof.creational.factorymethod.object.parentsimpleobject.ParentSimpleObject;

public class TestBuilder {

    public static ParentSimpleObject prepareTestData() {
        return new ParentSimpleObject();
    }

}
