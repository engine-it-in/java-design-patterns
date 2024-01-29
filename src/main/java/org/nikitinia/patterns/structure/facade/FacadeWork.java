package org.nikitinia.patterns.structure.facade;

public class FacadeWork {

    BuilderJob builderJob = new BuilderJob();

    Workflow workFlow = new Workflow();

    Builder builder = new Builder();

    public void canWorking() {
        builderJob.working();
        workFlow.startWork();
        builder.doingWork(workFlow);
    }

}
