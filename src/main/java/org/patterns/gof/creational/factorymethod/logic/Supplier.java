package org.patterns.gof.creational.factorymethod.logic;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

public class Supplier {

    public SimpleObject createObject() {
        return new SimpleObject() {
            @Override
            public void open() {
                System.out.printf("I was created in %s", this.getClass().getSimpleName());
            }
        };
    }

    public SimpleObject install() {
        SimpleObject simpleObject = createObject();
        onInstall(simpleObject);
        System.out.printf("%s was added", simpleObject);
        return simpleObject;
    }

    protected void onInstall(SimpleObject simpleObject) {
    }

}
