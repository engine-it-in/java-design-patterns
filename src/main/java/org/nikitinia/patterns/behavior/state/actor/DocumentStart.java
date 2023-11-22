package org.nikitinia.patterns.behavior.state.actor;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;

public class DocumentStart implements DocumentActivity {

    public Document document;

    @Override
    public void doAction() {
        System.out.println("start");
    }
}
