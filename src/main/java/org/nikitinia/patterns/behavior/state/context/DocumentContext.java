package org.nikitinia.patterns.behavior.state.context;

import lombok.Setter;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;
import org.nikitinia.patterns.behavior.state.actor.DocumentStart;
import org.nikitinia.patterns.behavior.state.actor.DocumentStop;


public class DocumentContext {

    @Setter
    public DocumentActivity documentActivity;


    public void doAction() {
        documentActivity.doAction();
    }
    public void changeAction() {
        if (documentActivity instanceof DocumentStart) {
           setDocumentActivity(new DocumentStop());
        } else if (documentActivity instanceof DocumentStop) {
            setDocumentActivity(new DocumentStart());
        }
    }

}
