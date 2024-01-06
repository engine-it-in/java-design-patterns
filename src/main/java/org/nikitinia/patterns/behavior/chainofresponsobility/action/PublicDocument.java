package org.nikitinia.patterns.behavior.chainofresponsobility.action;

import org.nikitinia.domain.dictionarys.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.actor.Activity;

public interface PublicDocument {

    void publicity(Document document, Activity activity);

}
