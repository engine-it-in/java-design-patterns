package behavior.TemplateMethod.logic.creators;

import org.nikitinia.domain.Document;
import org.nikitinia.domain.Invoice;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.DocumentCreator;

public class InvoiceCreatorTest extends DocumentCreator {


    public InvoiceCreatorTest() {
        super(new Invoice());
    }

    @Override
    public void showLink(Document document) {
        System.out.println(document + " invoice");
    }
}
