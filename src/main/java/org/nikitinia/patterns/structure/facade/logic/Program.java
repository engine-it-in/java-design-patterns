package org.nikitinia.patterns.structure.facade.logic;

import org.nikitinia.patterns.structure.facade.action.DeliveryRoute;
import org.nikitinia.patterns.structure.facade.action.PreparatoryMobileDocumentList;

public class Program {

    public static void main(String[] args) {
        FacadeWork facadeWork = new FacadeWork(new PreparatoryMobileDocumentList(), new DeliveryRoute());
        facadeWork.doWork();
    }

}
