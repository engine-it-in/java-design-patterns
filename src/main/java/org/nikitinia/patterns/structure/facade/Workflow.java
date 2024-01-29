package org.nikitinia.patterns.structure.facade;

public class Workflow {

    public boolean isActiveWork;

    public boolean isActiveWorkMethod() {
        return isActiveWork;
    }

    void startWork() {
        System.out.println("Starting work");
        isActiveWork = true;
    }

    void finishWork() {
        System.out.println("Finishing work");
        isActiveWork = false;
    }

}
