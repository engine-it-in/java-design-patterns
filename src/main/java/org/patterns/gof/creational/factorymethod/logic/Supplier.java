package org.patterns.gof.creational.factorymethod.logic;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

public class Supplier {

    public SimpleObject create() {
        return new SimpleObject() {
            @Override
            public void open() {
                System.out.println();
            }
        };
    }

}
