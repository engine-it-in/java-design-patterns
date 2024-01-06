package org.nikitinia.patterns.behavior.chainofresponsobility.actor;

import lombok.Setter;
import org.nikitinia.domain.dictionarys.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.action.PublicDocument;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.TypeSystem;


public class EmailActivity extends Activity {

    public EmailActivity(Priority priority) {
        super(priority);
    }

    @Override
    public void writeDocument(Document document) {
        System.out.println(TypeSystem.EMAIL.getSystem() + " : " + document);
    }
}
