package org.patterns.gof.creational.factorymethod.logic.collect;

import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

/**
 * Collect all instance objects */
public class GenericSupplier extends Supplier {

    /**
     * @see SimpleObject
     * */
    private final Class<? extends SimpleObject> simpleObjectType;

    /**
     * Container for all types of objects*/
    public GenericSupplier(Class<? extends SimpleObject> simpleObjectType) {
        this.simpleObjectType = simpleObjectType;
    }

    /**
     * Create objects - factory method
     * Realized dependency inversion (soliD)*/
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
