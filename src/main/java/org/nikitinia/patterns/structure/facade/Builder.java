package org.nikitinia.patterns.structure.facade;

public class Builder {

    public void doingWork(Workflow workFlow) {
        if(workFlow.isActiveWork) {
            System.out.println("Builder working");
        } else {
            System.out.println("Builder rest");
        }
    }

}
