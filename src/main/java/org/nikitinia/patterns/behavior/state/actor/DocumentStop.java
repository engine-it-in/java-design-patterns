package org.nikitinia.patterns.behavior.state.actor;

import org.nikitinia.domain.objects.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;

public class DocumentStop implements DocumentActivity {

    public Document document;

    @Override
    public void doAction() {
        System.out.println("stop");
    }
}
