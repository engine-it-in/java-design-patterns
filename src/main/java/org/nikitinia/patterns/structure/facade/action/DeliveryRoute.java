package org.nikitinia.patterns.structure.facade.action;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;

import java.util.HashMap;
import java.util.random.RandomGenerator;

@Slf4j
@Getter
public class DeliveryRoute {

    private HashMap<Integer, RecipientMobileDocument> recipientMobileDocumentMap;

    public DeliveryRoute() {
        this.recipientMobileDocumentMap = new HashMap<>();
    }


    public void addRecipientToDeliveryRoute(RecipientMobileDocument recipientMobileDocument) {
        int id = 0;

        while (recipientMobileDocumentMap.containsKey(id)) {
            id = RandomGenerator.getDefault().nextInt(1, 100);
        }
        recipientMobileDocumentMap.put(id, recipientMobileDocument);

        log.info("{} {} {} was added to delivery route with id {}",
                recipientMobileDocument.name(),
                recipientMobileDocument.surname(),
                recipientMobileDocument.patronymic(),
                id
        );
    }

}