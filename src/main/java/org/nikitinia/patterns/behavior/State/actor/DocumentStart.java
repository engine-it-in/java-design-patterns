package org.nikitinia.patterns.behavior.State.actor;

import org.nikitinia.domain.objects.Document;
import org.nikitinia.patterns.behavior.State.action.DocumentActivity;

public class DocumentStart implements DocumentActivity {

    public Document document;

    @Override
    public void doAction() {
        System.out.println("Start");
    }
}
