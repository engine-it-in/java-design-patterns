package org.patterns.gof.creational.factorymethod.logic.collect;

import org.patterns.gof.creational.factorymethod.main.Program;
import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

/**
 * Created all type objects in hierarchy */
public class Supplier {

    /**
     * Realized Liskov logic (soLid)*/
    public SimpleObject createObject() {
        return new SimpleObject() {

            @Override
            public void open() {
                System.out.println("Open object");
            }

            public String getSimpleName() {
                return this.getClass().getSimpleName();
            }
        };
    }

    /**
     * Collector created instance */
    protected void onInstall(SimpleObject simpleObject) {
        Program.objects.add(simpleObject);
    }

    /**
     * Prepare objects for work */
    public SimpleObject install() {
        SimpleObject simpleObject = createObject();
        onInstall(simpleObject);
        System.out.printf("%s was added ", simpleObject);
        return simpleObject;
    }

}
