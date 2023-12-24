package org.nikitinia.patterns.behavior.state.actor;

import lombok.Getter;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.state.action.DocumentActivity;

@Getter
public class DocumentStart extends DocumentState implements DocumentActivity {

    public Document document;

    public DocumentStart(Document document) {
        super(document);
    }

    @Override
    public void doAction() {
        addDocument();
        modifyDocumentStatus(Status.PRESIGN);
        notifyDocumentStatus();
    }

}
