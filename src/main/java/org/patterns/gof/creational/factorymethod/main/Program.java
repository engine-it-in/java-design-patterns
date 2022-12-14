package org.patterns.gof.creational.factorymethod.main;

import org.patterns.gof.creational.factorymethod.logic.collect.GenericSupplier;
import org.patterns.gof.creational.factorymethod.logic.collect.Supplier;
import org.patterns.gof.creational.factorymethod.logic.create.FamilyDaughter;
import org.patterns.gof.creational.factorymethod.logic.create.FamilySon;
import org.patterns.gof.creational.factorymethod.logic.create.GrandFamily;
import org.patterns.gof.creational.factorymethod.object.parentsimpleobject.ParentSimpleObject;
import org.patterns.gof.creational.factorymethod.object.simpleobject.SimpleObject;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static List<SimpleObject> objects = new ArrayList<>();

    public static void main(String[] args) {
        Supplier[] creators = new Supplier[] {
                new Supplier(),
                new FamilyDaughter(),
                new FamilySon(),
                new GrandFamily(),
                new GenericSupplier(ParentSimpleObject.class)};

        for (Supplier sr: creators)
            sr.install().open();

        System.out.println("Objects: ");

        for (SimpleObject so: objects)
            System.out.println(so);

    }

}
