package org.nikitinia.patterns.behavior.mediator;

import org.nikitinia.domain.model.documents.Document;

public interface CommunicationSystem {

    void senDocument(Document document, User user);
}
