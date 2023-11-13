package behavior.TemplateMethod.logic.creators;

import org.nikitinia.domain.Agreement;
import org.nikitinia.domain.Document;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.DocumentCreator;

public class AgreementCreatorTest extends DocumentCreator {

    public AgreementCreatorTest() {
        super(new Agreement());
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " agreement");
    }
}
