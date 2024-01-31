package org.nikitinia.patterns.structure.facade;

public class FacadeWork {

    BuilderJob builderJob = new BuilderJob();

    Workflow workFlow = new Workflow();

    MobileDocument mobileDocument = new MobileDocument();

    public void canWorking() {
        builderJob.working();
        workFlow.startWork();
        mobileDocument.doingWork(workFlow);
    }

}
