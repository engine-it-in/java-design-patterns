package org.nikitinia.patterns.behavior.chainofresponsobility.actor;

import org.nikitinia.domain.dictionarys.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.TypeSystem;

public class SmsActivity extends Activity {

    public SmsActivity(Priority priority) {
        super(priority);
    }

    @Override
    public void writeDocument(Document document) {
        System.out.println(TypeSystem.SMS.getSystem() + " : " + document);
    }
}