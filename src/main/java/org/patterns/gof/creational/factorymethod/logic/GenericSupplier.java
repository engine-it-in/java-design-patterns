package org.patterns.gof.creational.factorymethod.logic;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

public class GenericSupplier extends Supplier{

    private Class<? extends SimpleObject> simpleObjectType;

    public GenericSupplier(Class<? extends SimpleObject> simpleObjectType) {
        this.simpleObjectType = simpleObjectType;
    }

    @Override
    public SimpleObject createObject() {
        try {
            return simpleObjectType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return super.createObject();
        }
    }

}
