package behavior.TemplateMethod.logic.creators;

import org.nikitinia.domain.Bill;
import org.nikitinia.domain.Document;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.DocumentCreator;

public class BillCreatorTest extends DocumentCreator {

    public BillCreatorTest() {
        super(new Bill());
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " bill");
    }
}
