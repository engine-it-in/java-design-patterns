package org.nikitinia.patterns.behavior.mediator.logic;

import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.actor.User;

public interface DocumentSystem {

    void senDocument(Document document, User user);
}
