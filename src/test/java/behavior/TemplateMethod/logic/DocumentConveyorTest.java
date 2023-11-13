package behavior.TemplateMethod.logic;

import org.nikitinia.domain.Document;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.DocumentCreator;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.AgreementCreator;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.BillCreator;
import org.nikitinia.patterns.behavior.TemplateMethod.logic.creators.InvoiceCreator;

import java.util.ArrayList;
import java.util.List;

public class DocumentConveyorTest {

    static List<DocumentCreator> documentCreatorstList = new ArrayList<>();
    static List<Document> documentList= new ArrayList<>();
    public static void main(String[] args) {
        documentCreatorstList.add(new AgreementCreator());
        documentCreatorstList.add(new BillCreator());
        documentCreatorstList.add(new InvoiceCreator());

        documentCreatorstList
                .forEach(dc -> documentList.add(dc.createDocument()));

        System.out.println(documentList);

    }
}