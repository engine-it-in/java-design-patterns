package org.nikitinia.patterns.behavior.chainofresponsobility.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.domain.dictionarys.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.action.PublicDocument;


@Getter
@Setter
public abstract class Activity implements PublicDocument {

    private final Priority priority;

    PublicDocument next;

    public Activity(Priority priority) {
        this.priority = priority;
    }


    @Override
    public void publicity(Document document, Activity activity) {
        if (activity.getPriority().getLevel() <= priority.getLevel()) {
            writeDocument(document);
        }
        if (next != null) {
            next.publicity(document, activity);
        }
    }

    public abstract void writeDocument(Document document);

}
