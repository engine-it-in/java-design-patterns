package org.nikitinia.patterns.behavior.state.run;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;
import org.nikitinia.patterns.behavior.state.actor.DocumentStart;
import org.nikitinia.patterns.behavior.state.context.DocumentContext;

import java.util.logging.Logger;

public class Program {

    public static void main(String[] args) {
        Document document = DocumentCreator.documentBuildWithNumberAndStatus(1.0, Status.DRAFT);
        DocumentActivity documentActivity = new DocumentStart(document);
        DocumentContext documentContext = new DocumentContext(document);
        documentContext.setDocumentActivity(documentActivity);

        for (int i = 0; i < 10; i++) {

            documentContext.doAction();
            documentContext.changeAction();
        }

        documentActivity.printHistory();

    }

}
